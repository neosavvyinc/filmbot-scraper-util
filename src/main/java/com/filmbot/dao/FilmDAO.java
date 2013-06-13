package com.filmbot.dao;

import com.filmbot.domain.Film;
import com.filmbot.domain.mapper.FilmMapper;
import com.filmbot.domain.mapper.TheaterMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.Date;
import java.util.List;

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


    @SqlUpdate("insert into film_filmdetailed (film_ptr_id, runningTime, synopsis) " +
            "values(:id, :runningTime, :synopsis)")
    int insertFilmDetail(@Bind("id") Integer id,
                         @Bind("runningTime") Integer runningTime,
                         @Bind("synopsis") String synopsis);



    @SqlQuery("select " +
            " f.id as id, "+
            " f.name as name, "+
            " f.posterImage as posterImage, "+
            " f.scrapeName as scrapeName, "+
            " f.releaseDate as releaseDate, "+
            " fd.runningTime as runningTime, "+
            " fd.synopsis as synopsis "+
            " from film_film f left outer join film_filmdetailed fd "+
            " on f.id = fd.film_ptr_id")
    @Mapper(FilmMapper.class)
    List<Film> findFilms();


    //TODO: This should be returning just one result, but JDBI isn't playing nice
    @SqlQuery("select " +
            " f.id as id, "+
            " f.name as name, "+
            " f.posterImage as posterImage, "+
            " f.scrapeName as scrapeName, "+
            " f.releaseDate as releaseDate, "+
            " fd.runningTime as runningTime, "+
            " fd.synopsis as synopsis "+
            " from film_film f left outer join film_filmdetailed fd "+
            " on f.id = fd.film_ptr_id "+
            " where f.id = :id ")
    @Mapper(FilmMapper.class)
    List<Film> findFilmById(@Bind("id") Integer id);

    @SqlQuery("select " +
            " f.id as id, "+
            " f.name as name, "+
            " f.posterImage as posterImage, "+
            " f.scrapeName as scrapeName, "+
            " f.releaseDate as releaseDate, "+
            " fd.runningTime as runningTime, "+
            " fd.synopsis as synopsis "+
            " from film_film f left outer join film_filmdetailed fd "+
            " on f.id = fd.film_ptr_id "+
            " where f.name = :name ")
    @Mapper(FilmMapper.class)
    List<Film> findFilmByName(@Bind("name") String name);
}
