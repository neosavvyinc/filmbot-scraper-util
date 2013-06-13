package com.filmbot.domain;

import org.joda.time.DateTime;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 5/23/13
 * Time: 11:51 PM
 */
public class ShowtimeTest {

    @Test
    public void testGetDateTime() {

        List<String> relativeTimes = new ArrayList<String>();
        relativeTimes.add("Today");
        relativeTimes.add("Tomorrow");
        relativeTimes.add("Sunday");
        Showtime s = new Showtime(new Film(), "1:30", relativeTimes);
        Date d = s.getShowTimeFromString("Today", "11:05am");
        DateTime compareDate = new DateTime().withTimeAtStartOfDay();
        compareDate = compareDate.plusHours(11);
        compareDate = compareDate.plusMinutes(5);

        assertThat(compareDate, is(equalTo(new DateTime(d))));

        d = s.getShowTimeFromString("Tomorrow", "11:05am");
        compareDate = compareDate.plusDays(1);
        assertThat(compareDate, is(equalTo(new DateTime(d))));

    }


    @Test
    public void testGetDateTimesInEvening() {

        List<String> relativeTimes = new ArrayList<String>();
        relativeTimes.add("Today");
        relativeTimes.add("Tomorrow");
        relativeTimes.add("Sunday");
        Showtime s = new Showtime(new Film(), "1:30", relativeTimes);
        Date d = s.getShowTimeFromString("Today", "11:05pm");
        DateTime compareDate = new DateTime().withTimeAtStartOfDay();
        compareDate = compareDate.plusHours(23);
        compareDate = compareDate.plusMinutes(5);

        assertThat(compareDate, is(equalTo(new DateTime(d))));

        d = s.getShowTimeFromString("Tomorrow", "11:05pm");
        compareDate = compareDate.plusDays(1);
        assertThat(compareDate, is(equalTo(new DateTime(d))));

    }

    @Test
    public void testGetDateTimeNoPM() {

        List<String> relativeTimes = new ArrayList<String>();
        relativeTimes.add("Today");
        relativeTimes.add("Tomorrow");
        relativeTimes.add("Sunday");
        Showtime s = new Showtime(new Film(), "1:30", relativeTimes);
        Date d = s.getShowTimeFromString("Today", "11:00");
        DateTime compareDate = new DateTime().withTimeAtStartOfDay();
        compareDate = compareDate.plusHours(11);
//        compareDate = compareDate.plusMinutes(5);

        assertThat(compareDate, is(equalTo(new DateTime(d))));

        d = s.getShowTimeFromString("Tomorrow", "11:00");
        compareDate = compareDate.plusDays(1);
        assertThat(compareDate, is(equalTo(new DateTime(d))));

    }


    @Test
    public void testGetDateTimesInEveningNoPM() {

        List<String> relativeTimes = new ArrayList<String>();
        relativeTimes.add("Today");
        relativeTimes.add("Tomorrow");
        relativeTimes.add("Sunday");
        Showtime s = new Showtime(new Film(), "1:30", relativeTimes);
        Date d = s.getShowTimeFromString("Today", "11:05");
        DateTime compareDate = new DateTime().withTimeAtStartOfDay();
        compareDate = compareDate.plusHours(23);
        compareDate = compareDate.plusMinutes(5);

        assertThat(compareDate, is(equalTo(new DateTime(d))));

        d = s.getShowTimeFromString("Tomorrow", "11:05");
        compareDate = compareDate.plusDays(1);
        assertThat(compareDate, is(equalTo(new DateTime(d))));

    }

}
