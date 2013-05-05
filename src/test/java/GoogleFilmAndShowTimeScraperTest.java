import com.filmbot.domain.Film;
import com.filmbot.domain.Theater;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: adamparrish
 * Date: 5/3/13
 * Time: 7:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class GoogleFilmAndShowTimeScraperTest {

    private Theater theater;
    private GoogleFilmAndShowTimeScraper theaterAndShowTimeScraper;
    private String sourceUrl = "http://www.google.com/movies?near=new+york,+ny,+usa&tid=d037620376304024";

    @Before
    public void runTheaterScrape() throws IOException {

        theaterAndShowTimeScraper = new GoogleFilmAndShowTimeScraper();

        this.theater = (new GoogleTheaterScraper()).findFirstTheaterForUrl(sourceUrl);
        this.theater.setSourceUrl(sourceUrl);


    }


    @Test
    public void testFindFilmsForTheater() throws IOException {

        List<Film> filmsForTheater = theaterAndShowTimeScraper.findFilmsForTheater(theater);

        Assert.assertEquals(8, filmsForTheater.size());


    }

    @Test
    public void testFindShowtimesForFilmAndTheater() throws IOException {

        List<Film> films = theaterAndShowTimeScraper.findFilmsForTheater(theater);

        for (Film film : films) {
            film.setShowTimes(theaterAndShowTimeScraper.findShowtimesForTheaterAndFilm(theater, film));

            if( film.getName().equals("Iron Man 3")) {
                Assert.assertEquals(10, film.getShowTimes().size());
            }

        }

    }

}
