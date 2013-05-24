package com.filmbot.domain.mapper;

import com.filmbot.domain.Film;
import com.filmbot.domain.Theater;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 5/23/13
 * Time: 8:41 PM
 */
public class FilmMapper implements ResultSetMapper<Film> {
    @Override
    public Film map(int index, ResultSet r, StatementContext ctx) throws SQLException {

        Film film = new Film();

        film.setId(r.getInt("id"));

        return film;
    }
}
