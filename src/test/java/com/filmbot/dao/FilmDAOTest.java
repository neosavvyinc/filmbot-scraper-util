package com.filmbot.dao;

import com.filmbot.domain.Theater;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.skife.jdbi.v2.logging.PrintStreamLog;

import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 5/9/13
 * Time: 9:00 PM
 */
public class FilmDAOTest extends BaseDAOTest {


    protected FilmDAO dao;
    protected Theater theater;
    private TheaterDAO theaterDao;

    @Before
    public void setup() {
        dao = handle.attach(FilmDAO.class);
        theaterDao = handle.attach(TheaterDAO.class);

        handle.setSQLLog(new PrintStreamLog());
        handle.execute("INSERT INTO theater_theater ( id, name, address, city_id, neighbourHood_id ) " +
                "VALUES (0, 'Adams Theater', '143 Jackson', -1, -1)");
        theater = theaterDao.findTheaterByName("Adams Theater").get(0);
    }

    @Test
    public void insertOneFilmForTheater() {
        DateTime dt = new DateTime(1981, 8, 10, 4, 0, 0, 0);
        int id = dao.insertFilm("Adams Film", "Adams Films ScrapeName", dt.toDate(), "NoImage");

        List<Map<String, Object>> rs = handle.select("SELECT * FROM film_film");
        assertThat(rs.size(), is(equalTo(1)));

    }


}
