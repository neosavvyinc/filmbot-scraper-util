package com.filmbot.dao;

import com.filmbot.domain.Theater;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.skife.jdbi.v2.logging.Log4JLog;
import org.skife.jdbi.v2.logging.PrintStreamLog;
import org.slf4j.helpers.SubstituteLoggerFactory;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 5/9/13
 * Time: 10:06 PM
 */
public class TheaterDAOTest extends BaseDAOTest {

    private TheaterDAO dao;

    @Before
    public void setup() {
        dao = handle.attach(TheaterDAO.class);
        handle.setSQLLog(new PrintStreamLog());
        handle.execute("INSERT INTO theater_theater ( id, name, address, city_id, neighbourHood_id ) " +
                "VALUES (0, 'Adams Theater', '143 Jackson', -1, -1)");
        handle.execute("INSERT INTO theater_theater ( id, name, address, city_id, neighbourHood_id ) " +
                "VALUES (0, 'Adams Big Ass Theater', '143 Jackson', -1, -1)");
        handle.execute("INSERT INTO theater_theater ( id, name, address, city_id, neighbourHood_id ) " +
                "VALUES (0, 'Adams Rather Small Theater', '143 Jackson', -1, -1)");
        handle.execute("INSERT INTO theater_theater ( id, name, address, city_id, neighbourHood_id ) " +
                "VALUES (0, 'Maxs Rather Small Theater', '143 Jackson', -1, -1)");

    }

    @Test
    public void testFindByName() {

        Theater theaterExpected = new Theater("Adams Theater");
        //default auto increment starting point is 40 @see schema.sql for theater_theater table
        theaterExpected.setId(40);
        theaterExpected.setAddress("143 Jackson");

        List<Theater> theaterFound = dao.findTheaterByName("Adams%");

        assertThat(theaterFound.get(0), is(equalTo(theaterExpected)));
        assertThat(theaterFound.size(), is(equalTo(3)));

    }

    @Test
    public void testFindAll() {

        List<Theater> all = dao.findAll();

        assertThat(all.size(), is(equalTo(4)));

    }

}
