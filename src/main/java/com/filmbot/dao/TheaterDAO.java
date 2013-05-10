package com.filmbot.dao;

import com.filmbot.domain.Theater;
import com.filmbot.domain.mapper.TheaterMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 5/9/13
 * Time: 9:39 PM
 */
public interface TheaterDAO {

    @RegisterMapper(TheaterMapper.class)
    @SqlQuery("select t.id id, t.name name, t.address address, " +
            "td.googleUrl googleUrl from theater_theater t " +
            "left outer join theater_theaterdetailed td on t.id = td.theater_ptr_id " +
            "where t.name like :name")
    List<Theater> findTheaterByName(
            @Bind("name") String name
            );


    @RegisterMapper(TheaterMapper.class)
    @SqlQuery("select t.id id, t.name name, t.address address, " +
            "td.googleUrl googleUrl from theater_theater t " +
            "left outer join theater_theaterdetailed td on t.id = td.theater_ptr_id ")
    List<Theater> findAll();

    void close();

}
