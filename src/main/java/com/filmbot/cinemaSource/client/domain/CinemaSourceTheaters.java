package com.filmbot.cinemaSource.client.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.List;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 7/5/13
 * Time: 3:13 PM
 */
@XStreamAlias("theaters")
public class CinemaSourceTheaters {

    @XStreamAlias("house")
    private List<CinemaSourceHouse> houses;

    public List<CinemaSourceHouse> getHouses() {
        return houses;
    }

    public void setHouses(List<CinemaSourceHouse> houses) {
        this.houses = houses;
    }
}
