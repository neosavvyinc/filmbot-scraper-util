package com.filmbot.domain.mapper;

import com.filmbot.domain.Theater;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 5/9/13
 * Time: 9:51 PM
 */
public class TheaterMapper implements ResultSetMapper<Theater>{

    @Override
    public Theater map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {

        Theater t = new Theater(resultSet.getString("name"));
        t.setAddress(resultSet.getString("address"));
        t.setId(resultSet.getInt("id"));
        //t.setPhone(resultSet.getString("phone"));
        t.setSourceUrl(resultSet.getString("googleUrl"));

        return t;


    }
}
