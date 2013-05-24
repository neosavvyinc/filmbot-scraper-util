package com.filmbot.domain;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.Days;
import org.joda.time.Period;

import java.util.Date;
import java.util.List;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 5/3/13
 * Time: 12:48 AM
 */
public class Showtime {

    private final Film film;
    private final List<String> relativeDaysOfWeek;
    private Long id = -1L;
    private String time;
    private String date;

    public Showtime(Film film, String time, List<String> relativeDaysOfWeek) {
        this.film = film;
        this.time = time;
        this.relativeDaysOfWeek = relativeDaysOfWeek;
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

    public List<String> getRelativeDaysOfWeek() {
        return relativeDaysOfWeek;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Date getShowTimeFromString( String relativeDateString ) {

        DateTime now = new DateTime().withTimeAtStartOfDay();


        if("Today".equalsIgnoreCase(relativeDateString)) {
        }
        else if( "Tomorrow".equalsIgnoreCase(relativeDateString) ) {
            now = now.plusDays(1);
        }
        else {
            // must be a day of week
            int dayOfWeekToSet = -1;
            if("Sunday".equalsIgnoreCase(relativeDateString) ) {
                dayOfWeekToSet = DateTimeConstants.SUNDAY;
            }
            else if("Monday".equalsIgnoreCase(relativeDateString)) {
                dayOfWeekToSet = DateTimeConstants.MONDAY;
            }
            else if("Tuesday".equalsIgnoreCase(relativeDateString)) {
                dayOfWeekToSet = DateTimeConstants.TUESDAY;
            }
            else if("Wednesday".equalsIgnoreCase(relativeDateString)) {
                dayOfWeekToSet = DateTimeConstants.WEDNESDAY;
            }
            else if("Thursday".equalsIgnoreCase(relativeDateString)) {
                dayOfWeekToSet = DateTimeConstants.THURSDAY;
            }
            else if("Friday".equalsIgnoreCase(relativeDateString)) {
                dayOfWeekToSet = DateTimeConstants.FRIDAY;
            }
            else if("Saturday".equalsIgnoreCase(relativeDateString)) {
                dayOfWeekToSet = DateTimeConstants.SATURDAY;
            }

            if( dayOfWeekToSet == -1) {
                throw new UnsupportedOperationException("Unfortunately couldn't determine day of week");
            }

            DateTime nextDate = now.withDayOfWeek(dayOfWeekToSet);
            Days daysBetween = Days.daysBetween(now, nextDate);
            now = now.plusDays(daysBetween.getDays());

        }

        return now.toDate();
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
