package com.filmbot.cinemaSource.client.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 7/5/13
 * Time: 3:25 PM
 */
@XStreamAlias("showtimes")
public class CinemaSourceShowtime {


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

    private String date;
    private String attributes;
    private String sound;
    private String allowpasses;
    private String comments;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getAllowpasses() {
        return allowpasses;
    }

    public void setAllowpasses(String allowpasses) {
        this.allowpasses = allowpasses;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @XStreamAlias("showtime")
    @XStreamImplicit(itemFieldName = "showtime")
    public List<String> showtime;

    public List<String> getShowtime() {
        return showtime;
    }

    public void setShowtime(List<String> showtime) {
        this.showtime = showtime;
    }
}
