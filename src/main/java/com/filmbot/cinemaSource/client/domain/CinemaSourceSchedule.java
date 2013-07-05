package com.filmbot.cinemaSource.client.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 7/5/13
 * Time: 3:46 PM
 */
@XStreamAlias("schedule")
public class CinemaSourceSchedule {

    /*
    <schedule>
        <movie>
            <movie_id>140776</movie_id>
            <movie_name>Stories We Tell</movie_name>
            <movie_rating>PG-13</movie_rating>
            <showtimes date='7/5/2013' attributes='' sound='' allowpasses='Yes' comments=''>
                <showtime>11:00</showtime>
                <showtime>13:15</showtime>
                <showtime>15:30</showtime>
                <showtime>18:00</showtime>
                <showtime>20:15</showtime>
                <showtime>22:40</showtime>
            </showtimes>
        </movie>
        <movie>
            <movie_id>140776</movie_id>
            <movie_name>Stories We Tell</movie_name>
            <movie_rating>PG-13</movie_rating>
            <showtimes date='7/5/2013' attributes='' sound='' allowpasses='Yes' comments=''>
                <showtime>11:00</showtime>
                <showtime>13:15</showtime>
                <showtime>15:30</showtime>
                <showtime>18:00</showtime>
                <showtime>20:15</showtime>
                <showtime>22:40</showtime>
            </showtimes>
        </movie>
    </schedule>
     */

    @XStreamAlias("movie")
    private CinemaSourceMovie[] movie;

    public CinemaSourceMovie[] getMovie() {
        return movie;
    }

    public void setMovie(CinemaSourceMovie[] movie) {
        this.movie = movie;
    }
}
