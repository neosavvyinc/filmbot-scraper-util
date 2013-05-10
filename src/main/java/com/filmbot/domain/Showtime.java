package com.filmbot.domain;

import java.util.Date;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 5/3/13
 * Time: 12:48 AM
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Showtime)) return false;

        Showtime showtime = (Showtime) o;

        if (film != null ? !film.equals(showtime.film) : showtime.film != null) return false;
        if (id != null ? !id.equals(showtime.id) : showtime.id != null) return false;
        if (time != null ? !time.equals(showtime.time) : showtime.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = film != null ? film.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Showtime{" +
                "film=" + film +
                ", id=" + id +
                ", time='" + time + '\'' +
                '}';
    }
}
