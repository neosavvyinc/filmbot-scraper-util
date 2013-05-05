package com.filmbot.domain;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: adamparrish
 * Date: 5/3/13
 * Time: 12:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class Film {

    private Long id = -1L;
    private String name;
    private List<Showtime> showTimes;
    private Theater theater;

    public Film(String name, Theater theater) {
        this.name = name;
        this.theater = theater;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Showtime> getShowTimes() {
        return showTimes;
    }

    public void setShowTimes(List<Showtime> showTimes) {
        this.showTimes = showTimes;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }
}
