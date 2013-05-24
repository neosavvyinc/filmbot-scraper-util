package com.filmbot.dao;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

import java.util.Date;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 5/23/13
 * Time: 8:14 PM
 */
public interface ShowtimeDAO {

    @SqlUpdate("insert into showtime_showtime (theater_id, film_id, showTime, ticketUrl, soldOut) " +
               "values (:theater_id, :film_id, :showTime, :ticketUrl, 0)")
    @GetGeneratedKeys
    int insertShowTime(@Bind("theater_id") int theaterId,
                       @Bind("film_id") int filmId,
                       @Bind("showTime") Date showTime,
                       @Bind("ticketUrl") String ticketUrl
    );

}
