package com.filmbot.dao;

import com.filmbot.domain.Theater;
import com.filmbot.domain.mapper.TheaterMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
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
    @SqlQuery("select t.id id, t.name name, t.address address, t.cinema_source_id, " +
            "td.googleUrl googleUrl from theater_theater t " +
            "left outer join theater_theaterdetailed td on t.id = td.theater_ptr_id " +
            "where t.name like :name")
    List<Theater> findTheaterByName(
            @Bind("name") String name
            );

    @RegisterMapper(TheaterMapper.class)
    @SqlQuery("select t.id id, t.name name, t.address address, t.cinema_source_id, " +
            "td.googleUrl googleUrl from theater_theater t " +
            "left outer join theater_theaterdetailed td on t.id = td.theater_ptr_id " +
            "where t.cinema_source_id = :id")
    List<Theater> findTheaterByCinemaSourceId(
            @Bind("id") Integer id
    );

    @RegisterMapper(TheaterMapper.class)
    @SqlQuery("select t.id id, t.name name, t.address address, t.cinema_source_id, " +
            "td.googleUrl googleUrl from theater_theater t " +
            "left outer join theater_theaterdetailed td on t.id = td.theater_ptr_id ")
    List<Theater> findAll();

    @RegisterMapper(TheaterMapper.class)
    @SqlQuery("select t.id id, t.name name, t.address address, t.cinema_source_id, " +
            "td.googleUrl googleUrl from theater_theater t " +
            "left outer join theater_theaterdetailed td on t.id = td.theater_ptr_id " +
            "where t.id like :id")
    List<Theater> findById(@Bind("id") int id);

    @SqlUpdate("insert into theater_theater (name, address, city_id) " +
            "values(:name, 'no address', 0)")
    @GetGeneratedKeys
    int insertTheater(@Bind("name") String name);

    @SqlUpdate("insert into theater_theaterdetailed (theater_ptr_id, googleUrl, homePage) " +
            "values(:theaterId, :url, '')")
    @GetGeneratedKeys
    int insertTheaterDetail(@Bind("theaterId") int id,
                            @Bind("url") String url);

    void close();

}
