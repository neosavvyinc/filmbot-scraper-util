package com.filmbot.domain;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: adamparrish
 * Date: 5/3/13
 * Time: 12:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class Showtime {

    private final Film film;
    private Long id = -1L;
    private String time;

    public Showtime(Film film, String time) {
        this.film = film;
        this.time = time;
    }

    public Film getFilm() {
        return film;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
