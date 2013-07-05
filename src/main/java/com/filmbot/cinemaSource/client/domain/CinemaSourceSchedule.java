package com.filmbot.cinemaSource.client.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.List;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 7/5/13
 * Time: 3:46 PM
 */
@XStreamAlias("schedule")
public class CinemaSourceSchedule {

    @XStreamAlias("movie")
    private CinemaSourceMovie[] movie;

    public CinemaSourceMovie[] getMovie() {
        return movie;
    }

    public void setMovie(CinemaSourceMovie[] movie) {
        this.movie = movie;
    }
}
