import com.filmbot.domain.Theater;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

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

    @Before
    public void runTheaterScrape() throws IOException {

        theaterAndShowTimeScraper = new GoogleFilmAndShowTimeScraper();
        this.theater = (new GoogleTheaterScraper()).findFirstTheaterForUrl("http://www.google.com/movies?near=new+york,+ny,+usa&tid=d037620376304024");

    }


    @Test
    public void testFindFilmsForTheater() {

    }

    @Test
    public void testFindShowtimesForFilmAndTheater() {

    }

}
