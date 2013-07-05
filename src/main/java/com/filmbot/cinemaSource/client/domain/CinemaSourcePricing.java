package com.filmbot.cinemaSource.client.domain;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 7/5/13
 * Time: 3:19 PM
 */
public class CinemaSourcePricing {

    /*
    <pricing>
        <adult>$13.00</adult>
        <child>$9.50</child>
        <senior>$9.50</senior>
    </pricing>
     */

    private String adult;
    private String child;
    private String senior;

    public String getAdult() {
        return adult;
    }

    public void setAdult(String adult) {
        this.adult = adult;
    }

    public String getChild() {
        return child;
    }

    public void setChild(String child) {
        this.child = child;
    }

    public String getSenior() {
        return senior;
    }

    public void setSenior(String senior) {
        this.senior = senior;
    }
}
