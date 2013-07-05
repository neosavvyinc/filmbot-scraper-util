import com.filmbot.domain.Film;
import com.filmbot.domain.Showtime;
import com.filmbot.domain.Theater;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
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
    private String sourceUrl = "file:///FILMBOT/filmbot-scraper-utl/src/test/resources/mockdata/regalPark.html";

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
                Assert.assertEquals(9, film.getShowTimes().size());
            }

        }

    }

    @Test
    public void testAddTimeModifersToShowtimes( ) {

        List<Showtime> showtimesForDay = new ArrayList<Showtime>();
        showtimesForDay.add(new Showtime(null, "11:40am", null, null));
        showtimesForDay.add(new Showtime(null, "1:30", null, null));
        showtimesForDay.add(new Showtime(null, "2:30", null, null));
        showtimesForDay.add(new Showtime(null, "4:30", null, null));
        showtimesForDay.add(new Showtime(null, "5:20", null, null));
        showtimesForDay.add(new Showtime(null, "8:15", null, null));
        showtimesForDay.add(new Showtime(null, "10:25", null, null));
        showtimesForDay.add(new Showtime(null, "11:00pm", null, null));

        theaterAndShowTimeScraper.appendTimeModifiers(showtimesForDay);

        Assert.assertEquals(showtimesForDay.get(0).getTime(), "11:40am");
        Assert.assertEquals(showtimesForDay.get(1).getTime(), "1:30pm");
        Assert.assertEquals(showtimesForDay.get(2).getTime(), "2:30pm");
        Assert.assertEquals(showtimesForDay.get(3).getTime(), "4:30pm");
        Assert.assertEquals(showtimesForDay.get(4).getTime(), "5:20pm");
        Assert.assertEquals(showtimesForDay.get(5).getTime(), "8:15pm");
        Assert.assertEquals(showtimesForDay.get(6).getTime(), "10:25pm");
        Assert.assertEquals(showtimesForDay.get(7).getTime(), "11:00pm");


    }

    @Test
    public void testAddTimeModifiersOnlyAfternoonTimes( ) {

        List<Showtime> showtimesForDay = new ArrayList<Showtime>();
        showtimesForDay.add(new Showtime(null, "1:30", null, null));
        showtimesForDay.add(new Showtime(null, "2:30", null, null));
        showtimesForDay.add(new Showtime(null, "4:30", null, null));
        showtimesForDay.add(new Showtime(null, "5:20", null, null));
        showtimesForDay.add(new Showtime(null, "8:15", null, null));
        showtimesForDay.add(new Showtime(null, "10:25", null, null));
        showtimesForDay.add(new Showtime(null, "11:00pm", null, null));

        theaterAndShowTimeScraper.appendTimeModifiers(showtimesForDay);

        Assert.assertEquals(showtimesForDay.get(0).getTime(), "1:30pm");
        Assert.assertEquals(showtimesForDay.get(1).getTime(), "2:30pm");
        Assert.assertEquals(showtimesForDay.get(2).getTime(), "4:30pm");
        Assert.assertEquals(showtimesForDay.get(3).getTime(), "5:20pm");
        Assert.assertEquals(showtimesForDay.get(4).getTime(), "8:15pm");
        Assert.assertEquals(showtimesForDay.get(5).getTime(), "10:25pm");
        Assert.assertEquals(showtimesForDay.get(6).getTime(), "11:00pm");


    }

    @Test
    public void testAddTimeModifiersOnlyAfternoonTimesExceptMidnight( ) {

        List<Showtime> showtimesForDay = new ArrayList<Showtime>();
        showtimesForDay.add(new Showtime(null, "1:30", null, null));
        showtimesForDay.add(new Showtime(null, "2:30", null, null));
        showtimesForDay.add(new Showtime(null, "4:30", null, null));
        showtimesForDay.add(new Showtime(null, "5:20", null, null));
        showtimesForDay.add(new Showtime(null, "8:15", null, null));
        showtimesForDay.add(new Showtime(null, "10:25", null, null));
        showtimesForDay.add(new Showtime(null, "11:00pm", null, null));
        showtimesForDay.add(new Showtime(null, "12:10am", null, null));

        theaterAndShowTimeScraper.appendTimeModifiers(showtimesForDay);

        Assert.assertEquals(showtimesForDay.get(0).getTime(), "1:30pm");
        Assert.assertEquals(showtimesForDay.get(1).getTime(), "2:30pm");
        Assert.assertEquals(showtimesForDay.get(2).getTime(), "4:30pm");
        Assert.assertEquals(showtimesForDay.get(3).getTime(), "5:20pm");
        Assert.assertEquals(showtimesForDay.get(4).getTime(), "8:15pm");
        Assert.assertEquals(showtimesForDay.get(5).getTime(), "10:25pm");
        Assert.assertEquals(showtimesForDay.get(6).getTime(), "11:00pm");
        Assert.assertEquals(showtimesForDay.get(7).getTime(), "12:10am");


    }

    @Test
        public void testAppendTimeModifiersMorningTillAfterMidnight( ) {

        List<Showtime> showtimesForDay = new ArrayList<Showtime>();
        showtimesForDay.add(new Showtime(null, "11:30am", null, null));
        showtimesForDay.add(new Showtime(null, "1:30", null, null));
        showtimesForDay.add(new Showtime(null, "2:30", null, null));
        showtimesForDay.add(new Showtime(null, "4:30", null, null));
        showtimesForDay.add(new Showtime(null, "5:20", null, null));
        showtimesForDay.add(new Showtime(null, "8:15", null, null));
        showtimesForDay.add(new Showtime(null, "10:25", null, null));
        showtimesForDay.add(new Showtime(null, "11:00pm", null, null));
        showtimesForDay.add(new Showtime(null, "12:10am", null, null));

        theaterAndShowTimeScraper.appendTimeModifiers(showtimesForDay);

        Assert.assertEquals(showtimesForDay.get(0).getTime(), "11:30am");
        Assert.assertEquals(showtimesForDay.get(1).getTime(), "1:30pm");
        Assert.assertEquals(showtimesForDay.get(2).getTime(), "2:30pm");
        Assert.assertEquals(showtimesForDay.get(3).getTime(), "4:30pm");
        Assert.assertEquals(showtimesForDay.get(4).getTime(), "5:20pm");
        Assert.assertEquals(showtimesForDay.get(5).getTime(), "8:15pm");
        Assert.assertEquals(showtimesForDay.get(6).getTime(), "10:25pm");
        Assert.assertEquals(showtimesForDay.get(7).getTime(), "11:00pm");
        Assert.assertEquals(showtimesForDay.get(8).getTime(), "12:10am");


    }


}
