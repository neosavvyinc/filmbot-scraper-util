import com.filmbot.BaseOrchestrator;
import com.filmbot.DaoEnabled;
import com.filmbot.cinemaSource.client.TheaterClient;
import com.filmbot.cinemaSource.client.domain.generated.HouseType;
import com.filmbot.cinemaSource.client.domain.generated.MovieType;
import com.filmbot.cinemaSource.client.domain.generated.ShowtimesType;
import com.filmbot.domain.Film;
import com.filmbot.domain.Theater;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBElement;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 7/11/13
 * Time: 9:10 PM
 */
public class CinemaSourceOrchestrator extends BaseOrchestrator {

    public static final Logger LOG = LoggerFactory.getLogger(CinemaSourceOrchestrator.class);

    public static void main(String[] args) {

        if( args == null || args.length != 3) {

            LOG.error("Call the CinemaSourceOrchestrator with two arguments");
            LOG.error("Example Usage: java -jar scraper-1.0.jar <dbusername> <dbpassword> <dbName>");

            System.exit(1);
        }



        CinemaSourceOrchestrator orchestrator = new CinemaSourceOrchestrator();

        dbUserName  = args[0];
        dbPassword  = args[1];
        dbName      = args[2];

        orchestrator.orchestrate();
    }

    public void orchestrate() {

        try {
            long startTime = System.nanoTime();

            init();
            cleanupShowTimes();
            //insertTheatersFromCSV();

            TheaterClient client = new TheaterClient();
            process(client.findShowtimesForAllTheaters());

            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.print("Took " + duration + "(ms) to process");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void process(List<HouseType> showtimesForAllTheaters) {

        for (int i = 0; i < showtimesForAllTheaters.size(); i++) {
            HouseType h = showtimesForAllTheaters.get(i);
            LOG.debug("H[" + i + "]: " + h.getName());
            LOG.debug("H[" + i + "]: " + h.getHouseId());

            List<Theater> matches = theaterDao.findTheaterByCinemaSourceId(Integer.parseInt(h.getHouseId()));
            if( matches != null && matches.size() > 0 ) {

                Theater theater = matches.get(0);

                LOG.debug("Found a match for {}", h.getName());
                LOG.debug("Loading the schedule...");

                HouseType.Schedule schedule = h.getSchedule();
                for ( int j = 0; j < schedule.getContent().size(); j++ ) {

                    if(schedule.getContent().get(j) instanceof JAXBElement) {

                        Serializable serializable = schedule.getContent().get(j);
                        JAXBElement element = (JAXBElement) serializable;
                        MovieType movie = (MovieType) element.getValue();

                        LOG.debug("Movie {}", movie.getMovieName());

                        //@TREVOR, added this so we would reference films by scrape names instead
                        List<Film> filmsByScrapeName = filmDao.findFilmByScrapeName(movie.getMovieName());
                        List<Film> filmsByName = filmDao.findFilmByName(movie.getMovieName());
                        if( filmsByScrapeName != null && filmsByScrapeName.size() > 0 ) {

                            LOG.debug("Found a movie by scrape name so updating showtimes for it...");

                            updateShowtimes(movie, filmsByScrapeName.get(0), theater);

                        } else if (filmsByName != null && filmsByName.size() > 0) {

                            LOG.debug("Found a movie by name so updating showtimes for it...");

                            updateShowtimes(movie, filmsByName.get(0), theater);
                        }
                        else {
                            int runtime =0 ;
                            try {
                                runtime=Integer.parseInt(movie.getRuntime());
                            } catch (NumberFormatException e) {
                                LOG.error("Error while parsing runtime - defaulting to 0 for: ", movie.getName());
                            }
                            int id = filmDao.insertFilm(movie.getMovieName(), movie.getMovieName(), null, "", runtime, movie.getSynopsis());
                            filmsByName = filmDao.findFilmById(id);
                            updateShowtimes(movie, filmsByName.get(0), theater);
                        }
                    }
                }
            }
        }
    }

    private void updateShowtimes(MovieType movie, Film film, Theater theater) {
        List<ShowtimesType> showtimes = movie.getShowtimes();
        List<String> showtimeStrings = showtimes.get(0).getShowtime();

        try {
            for ( int k = 0; k < showtimeStrings.size(); k++) {
                LOG.debug("movietime> {} {}",showtimes.get(0).getDate(),showtimeStrings.get(k));

                String movieTime = showtimes.get(0).getDate() + " " + showtimeStrings.get(k);
                DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm");
                Date showtimeDate = df.parse(movieTime);


                showtimeDAO.insertShowTime(
                        theater.getId(), film.getId(), showtimeDate, ""
                );

            }
        } catch (ParseException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }

}
