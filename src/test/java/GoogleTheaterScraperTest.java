import com.filmbot.domain.Theater;
import junit.framework.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: adamparrish
 * Date: 5/3/13
 * Time: 12:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class GoogleTheaterScraperTest {

    private GoogleTheaterScraper scraper = new GoogleTheaterScraper();

    @Test
    public void testFindTheatersForUrl() {
        try {
            List<Theater> theaters = scraper.findTheatersForUrl("http://www.google.com/movies?near=new+york,+ny,+usa");
            Assert.assertEquals(10, theaters.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFindTheatersForBrokenInvalidUrl() {
        try {
            List<Theater> theaters = scraper.findTheatersForUrl("http://www.google.com/");
            Assert.assertEquals(0, theaters.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFindFirstTheaterForUrl() {
        try {
            Theater theater = scraper.findFirstTheaterForUrl("http://www.google.com/movies?near=new+york,+ny,+usa&tid=d037620376304024");
            Assert.assertEquals("Regal Battery Park Stadium 11",theater.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFindFirstTheaterForBrokenInvalidUrl() {
        try {
            Theater theater = scraper.findFirstTheaterForUrl("http://www.google.com/movies?near=new+york,+ny,+usa&tid=asdfasfaf");
            Assert.assertEquals(null, theater);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
