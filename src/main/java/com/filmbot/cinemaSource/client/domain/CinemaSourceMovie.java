package com.filmbot.cinemaSource.client.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 7/5/13
 * Time: 3:25 PM
 */
@XStreamAlias("movie")
public class CinemaSourceMovie {

    @XStreamOmitField
    private Integer movie_id;

    @XStreamOmitField
    private String movie_name;

    @XStreamOmitField
    private String movie_rating;

    @XStreamOmitField
    private CinemaSourceShowtime[] showtimes;

    public Integer getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Integer movie_id) {
        this.movie_id = movie_id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getMovie_rating() {
        return movie_rating;
    }

    public void setMovie_rating(String movie_rating) {
        this.movie_rating = movie_rating;
    }

    public CinemaSourceShowtime[] getShowtimes() {
        return showtimes;
    }

    public void setShowtimes(CinemaSourceShowtime[] showtimes) {
        this.showtimes = showtimes;
    }
}
