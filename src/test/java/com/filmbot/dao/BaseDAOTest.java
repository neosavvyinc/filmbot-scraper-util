package com.filmbot.dao;

import com.filmbot.db.DBUtil;
import com.filmbot.domain.Film;
import com.filmbot.domain.Theater;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import javax.swing.*;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: adamparrish
 * Date: 5/9/13
 * Time: 8:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class BaseDAOTest {

    static final Logger LOG = LoggerFactory.getLogger(BaseDAOTest.class);


    protected DataSource dataSource;
    protected DBI dbi;
    protected Handle handle;

    @Before
    public void setupDatabase() throws SQLException, ClassNotFoundException {

        DBUtil.runDBScript(
                "/FILMBOT/filmbot-scraper-utl/src/test/resources/db/schema.sql",
                "filmbot_20",
                "filmbot_20",
                "filmbot_20_development"
        );

    }


    @Before
    public void setupJDBI() {

        dbi = DBUtil.initDBI("filmbot_20", "filmbot_20", "filmbot_20_development");
        handle = dbi.open();

    }

    @After
    public void tearDown() throws Exception
    {
        handle.close();
    }

}
