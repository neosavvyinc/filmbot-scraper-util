package com.filmbot.db;

import com.ibatis.common.jdbc.ScriptRunner;
import org.skife.jdbi.v2.DBI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created with IntelliJ IDEA.
 * User: adamparrish
 * Date: 5/9/13
 * Time: 8:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class DBUtil {


    public static void runDBScript( String scriptPath, String user, String pass, String database ) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database, user, pass);

        try {
            ScriptRunner sr = new ScriptRunner(con, false, false);

            Reader reader = new BufferedReader(
                    new FileReader(scriptPath));

            sr.runScript(reader);

        } catch (Exception e) {
            System.err.println("Failed to Execute" + scriptPath + " The error is " + e.getMessage());
        }

    }

    public static DBI initDBI( String user, String pass, String database) {
        return new DBI("jdbc:mysql://127.0.0.1:3306/" + database, user, pass);
    }


}
