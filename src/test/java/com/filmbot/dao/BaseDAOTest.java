package com.filmbot.dao;

import com.filmbot.db.DBUtil;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: adamparrish
 * Date: 5/9/13
 * Time: 8:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class BaseDAOTest {


    @Before
    public void setupDatabase() throws SQLException, ClassNotFoundException {

        DBUtil.runDBScript(
                "/FILMBOT/filmbot-scraper-utl/src/test/resources/db/schema.sql",
                "filmbot_20",
                "filmbot_20",
                "filmbot_20_development"
        );

    }

    @Test
    public void simpleTest() {
        System.out.print("DB Runnin...");
    }

}
