package com.filmbot.dao;

import com.filmbot.domain.Film;
import com.filmbot.domain.Theater;
import org.joda.time.DateTime;
import org.joda.time.Period;
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

        Period runningTime = new Period().withHours(2).withMinutes(55);

        dao.insertFilmDetail(id, runningTime.getMillis(), "This is the synopsis");
        List<Map<String, Object>> rs = handle.select("SELECT * FROM film_film");
        assertThat(rs.size(), is(equalTo(1)));

        List<Map<String, Object>> rsDetail = handle.select("SELECT * FROM film_filmdetailed");
        assertThat(rsDetail.size(), is(equalTo(1)));

        List<Film> films = dao.findFilmById(id);
        assertThat(films.get(0).getId(), is(equalTo(id)));

    }

    @Test
    public void findFilms() {
        DateTime dt = new DateTime(1981, 8, 10, 4, 0, 0, 0);
        int id1 = dao.insertFilm("Max's Film", "Max's in your face awesome scrapename", dt.toDate(), "NoImage");
        int id2 = dao.insertFilm("Trevor's Film", "Trevor's wicked awesome scrapname", dt.toDate(), "NoImage");
        int id3 = dao.insertFilm("Chris's Film", "Chris's uber chill laid back name", dt.toDate(), "NoImage");
        List<Film> films = dao.findFilms();
        assertThat(films.get(0).getId(), is(equalTo(id1)));
        assertThat(films.get(1).getId(), is(equalTo(id2)));
        assertThat(films.get(2).getId(), is(equalTo(id3)));
    }


}
