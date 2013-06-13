import com.filmbot.DaoEnabled;
import com.filmbot.domain.Film;
import com.filmbot.domain.Showtime;
import com.filmbot.domain.Theater;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 5/23/13
 * Time: 11:09 PM
 */
public class GoogleScraperOrchestrator extends DaoEnabled {

    private GoogleTheaterScraper theaterScraper = new GoogleTheaterScraper();
    private GoogleFilmAndShowTimeScraper filmAndShowScraper = new GoogleFilmAndShowTimeScraper();

    public static void main(String[] args) {
        GoogleScraperOrchestrator orchestrator = new GoogleScraperOrchestrator();
        orchestrator.orchestrate();
    }

    public void orchestrate() {

        try {
            long startTime = System.nanoTime();

            init();
            cleanupShowTimes();
            //insertTheatersFromCSV();
            findAllFilmsForTheaters();

            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.print("Took " + duration + "(ms) to process");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void insertTheatersFromCSV() {
        String csvFile = "/FILMBOT/filmbot-scraper-utl/src/main/resources/theatersToScrape.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = "#";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] theater = line.split(cvsSplitBy);

                int theaterId = theaterDao.insertTheater(theater[0]);
                theaterDao.insertTheaterDetail(theaterId, theater[2]);


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void cleanupShowTimes() {
        handle.execute("truncate table showtime_showtime");
    }

    public void findAllFilmsForTheaters() throws IOException {

        List<Theater> theaters = theaterDao.findAll();
        for (Theater theater : theaters) {
            if( theater.getSourceUrl() != null && !theater.getSourceUrl().equals("")) {
                List<Film> films = filmAndShowScraper.findFilmsForTheater(theater);

                for (Film film : films) {
                    List<Showtime> showTimes = filmAndShowScraper.findShowtimesForTheaterAndFilm(theater, film);
                    film.setShowTimes(showTimes);

                    //TODO: Fix Release Date
                    //TODO: Fix Poster Image

                    List<Film> filmsByName = filmDao.findFilmByName(film.getName());
                    if( filmsByName.size() == 0 ) {
                        film.setId(filmDao.insertFilm(film.getName(), film.getName(), null, ""));
                    } else {
                        film.setId(filmsByName.get(0).getId());
                    }

                    for(Showtime showtime : showTimes ) {
                        //TODO: Fix the ticketUrl
                        //TODO: Fix showtime date
                        showtimeDAO.insertShowTime(theater.getId(), film.getId(), new Date(), "");
                    }
                }

                //temporarily only one theater is being updated
                break;

            }
        }

    }



}
