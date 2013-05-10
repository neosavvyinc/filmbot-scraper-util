package com.filmbot.dao;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

import java.util.Date;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 5/9/13
 * Time: 9:00 PM
 */
public interface  FilmDAO {

    @SqlUpdate("insert into film_film (name, scrapeName, releaseDate, posterImage) " +
            "values(:name, :scrapeName, :releaseDate, :posterImage)")
    @GetGeneratedKeys
    int insertFilm(@Bind("name") String name,
                   @Bind("scrapeName") String scrapeName,
                   @Bind("releaseDate") Date releaseDate,
                   @Bind("posterImage") String posterImage);

}
