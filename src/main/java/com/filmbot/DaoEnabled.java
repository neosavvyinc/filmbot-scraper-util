package com.filmbot;

import com.filmbot.dao.FilmDAO;
import com.filmbot.dao.ShowtimeDAO;
import com.filmbot.dao.TheaterDAO;
import com.filmbot.db.DBUtil;
import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;
import org.skife.jdbi.v2.logging.PrintStreamLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 5/23/13
 * Time: 11:03 PM
 */
public abstract class DaoEnabled {

    static final Logger LOG = LoggerFactory.getLogger(DaoEnabled.class);

    protected DataSource dataSource;
    protected DBI dbi;
    protected Handle handle;

    protected FilmDAO filmDao;
    protected TheaterDAO theaterDao;
    protected ShowtimeDAO showtimeDAO;

    protected void init() {
//        dbi = DBUtil.initDBI("filmbot_20", "giJ0e501F0rever", "filmbot_20_production");
        dbi = DBUtil.initDBI("filmbot_20", "filmbot_20", "filmbot_20_development");
        handle = dbi.open();

        filmDao = handle.attach(FilmDAO.class);
        theaterDao = handle.attach(TheaterDAO.class);
        showtimeDAO = handle.attach(ShowtimeDAO.class);
        handle.setSQLLog(new PrintStreamLog());
    }

    protected void destroy() {
        handle.close();
    }


}
