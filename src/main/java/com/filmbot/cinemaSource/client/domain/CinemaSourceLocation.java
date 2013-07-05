package com.filmbot.cinemaSource.client.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.List;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 7/5/13
 * Time: 3:11 PM
 */
@XStreamAlias("location")
public class CinemaSourceLocation {

    @XStreamAlias("theaters")
    private List<CinemaSourceTheaters> theaters;

    public List<CinemaSourceTheaters> getTheaters() {
        return theaters;
    }

    public void setTheaters(List<CinemaSourceTheaters> theaters) {
        this.theaters = theaters;
    }
}
