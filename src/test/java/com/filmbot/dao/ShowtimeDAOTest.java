package com.filmbot.dao;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.skife.jdbi.v2.logging.PrintStreamLog;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

import java.util.Date;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 5/23/13
 * Time: 9:14 PM
 */
public class ShowtimeDAOTest extends BaseDAOTest {

    private ShowtimeDAO dao;

    @Before
    public void setup() {
        dao = handle.attach(ShowtimeDAO.class);
        handle.setSQLLog(new PrintStreamLog());
    }



    @Test
    public void testInsertSimpleShowTime() {

        DateTime d = new DateTime(2013,5,23,12,30);
        dao.insertShowTime(1,2,d.toDate(),"http://get.your.tickets.here.com");
        List<Map<String, Object>> rsDetail = handle.select("SELECT * FROM showtime_showtime");
        assertThat(rsDetail.size(), is(equalTo(1)));

    }



}
