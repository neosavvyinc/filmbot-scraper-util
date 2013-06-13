package com.filmbot.util;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 5/6/13
 * Time: 6:40 PM
 */
public class TimeUtil {

    public static boolean isValidTimeString(String runtimeString) {

        if( runtimeString == null ) {
            return false;
        }
        else {

            String trimmmedShowTime = runtimeString.trim();
            trimmmedShowTime = trimmmedShowTime.replaceAll("[^\\x00-\\x7F]", "");

            Pattern p = Pattern.compile("([01]?[0-9]):[0-5][0-9](am|pm)?");
            Matcher m = p.matcher(trimmmedShowTime);
            return m.matches();

        }

    }

    public static String sanitizeDateString(String dateString) {
        String trimmmedShowTime = dateString.trim();
        trimmmedShowTime = trimmmedShowTime.replaceAll("[^\\x00-\\x7F]", "");
        return trimmmedShowTime;
    }

    public static DateTime getTimeForString(String timeString) {
        DateTimeFormatter fmt;
        if( timeString.endsWith("am") || timeString.endsWith("pm") ||
                timeString.endsWith("AM") || timeString.endsWith("PM") )
        {
            fmt = DateTimeFormat.forPattern("h:mmaa");
        }
        else
        {
            fmt = DateTimeFormat.forPattern("hh:mm");
        }

        DateTime timeValue = fmt.parseDateTime(timeString);
        return timeValue;
    }

}
