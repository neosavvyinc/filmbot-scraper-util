import com.filmbot.DaoEnabled;
import com.filmbot.domain.Film;
import com.filmbot.domain.Showtime;
import com.filmbot.domain.Theater;

import java.io.IOException;
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

    public void orchestrate() {

        try {
            init();
            cleanupShowTimes();
            findAllFilmsForTheaters();
        } catch (IOException e) {
            e.printStackTrace();
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
                }

            }
        }

    }



}
