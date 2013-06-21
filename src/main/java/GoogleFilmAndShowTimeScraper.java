import com.filmbot.domain.Film;
import com.filmbot.domain.ScraperConstants;
import com.filmbot.domain.Showtime;
import com.filmbot.domain.Theater;
import com.filmbot.util.JsoupUtil;
import com.filmbot.util.TimeUtil;
import org.joda.time.DateTime;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created for the awesomeness of FilmBot by Neosavvy!
 * User: adamparrish
 * Date: 5/9/13
 * Time: 9:00 PM
 */
public class GoogleFilmAndShowTimeScraper implements ScraperConstants {

    public List<Film> findFilmsForTheater(Theater theater) throws IOException {
        List<Film> films = new ArrayList<Film>();

        Document baseDocument = JsoupUtil.getDocument(theater.getSourceUrl());

        Elements filmElements = baseDocument.select(".theater .showtimes .movie .name");
        Iterator<Element> filmIterator = filmElements.iterator();

        while(filmIterator.hasNext()) {

            Element filmChild = filmIterator.next();
            System.out.println(filmChild.text());
            films.add(new Film(filmChild.text(), theater));

        }

        return films;

    }

    public List<Showtime> findShowtimesForTheaterAndFilm(Theater theater, Film film) throws IOException {

        List<Showtime> showtimes = new ArrayList<Showtime>();


        for( int i = 0; i < 7; i++ ) {
            Document baseDocument = JsoupUtil.getDocument(theater.getSourceUrl()+"&date="+i);
//            Document baseDocument = JsoupUtil.getDocument(theater.getSourceUrl());

            String selector = ".theater .showtimes .movie .name"; //selects a movie
            Elements filmElements = baseDocument.select(selector);
            List<Showtime> showtimesForDay = new ArrayList<Showtime>();

            for (Element filmElement : filmElements) {

                if( film.getName().equals(filmElement.text()) ) {

                    List<String> relativeDays = findRelativeDays(baseDocument);
                    Elements showtimeElements = filmElement.parent().select(".times span");
                    Iterator<Element> filmIterator = showtimeElements.iterator();

                    while(filmIterator.hasNext()) {

                        Element showtimeElement = filmIterator.next();
                        Showtime showtimeToAdd;

                        if(TimeUtil.isValidTimeString(showtimeElement.text())) {
                            DateTime startOfToday = new DateTime().withTimeAtStartOfDay();
                            startOfToday = startOfToday.plusDays(i);

                            showtimeToAdd = new Showtime(film, TimeUtil.sanitizeDateString(showtimeElement.text()), relativeDays, startOfToday.toDate());
                            showtimesForDay.add(showtimeToAdd);
//                            System.out.println("Showtime[ " + film.getName() + " ] Theater[ " + theater.getName() + " ] " + showtimeToAdd.getDate() + " " + showtimeToAdd.getTime());
                        }

                    }

                    appendTimeModifiers(showtimesForDay);


                    break;

                }

            }

            showtimes.addAll(showtimesForDay);
        }

        return showtimes;

    }

    public void appendTimeModifiers(List<Showtime> showtimesForDay) {
        Boolean startsInMorning = false;
        Integer numElements = 0;
        Integer startHour = null;
        for (Showtime showtime : showtimesForDay) {
            if( numElements == 0 ) {

                String[] startTimeParts = showtime.getTime().split(":");
                startHour = Integer.parseInt(startTimeParts[0]);

                if( showtime.getTime().toLowerCase().endsWith("am") ) {
                    startsInMorning = true;
                }
                else if ( showtime.getTime().toLowerCase().endsWith("pm") ){
                    startsInMorning = false;
                }
            }

            if( startsInMorning ) {

                if( !(showtime.getTime().endsWith("am")
                        || showtime.getTime().endsWith("pm")) ){

                    Integer currentHour = Integer.parseInt(showtime.getTime().split(":")[0]);
                    if( currentHour < startHour ) {
                        showtime.setTime( showtime.getTime() + "pm");
                    }


                }

            }
            else {
                if( !(showtime.getTime().endsWith("am")
                        || showtime.getTime().endsWith("pm")) ){
                    showtime.setTime( showtime.getTime() + "pm");
                }
            }

            System.out.println("Showtime[ " + showtime.getFilm().getName() + " ] Theater[ " + showtime.getFilm().getTheater().getName() + " ] " + showtime.getDate() + " " + showtime.getTime());

            numElements++;
        }
    }

    private List<String> findRelativeDays(Document baseDocument) {
        Element leftHandElements = baseDocument.select("#left_nav > div").first();
        Elements daysOfWeek = leftHandElements.select("div > div");
        List<String> returnValues = new ArrayList<String>();
        for (Element dayElement : daysOfWeek) {
            String relativeDayOfWeek = dayElement.text();
            relativeDayOfWeek = relativeDayOfWeek.replaceFirst("›", "");
            relativeDayOfWeek = relativeDayOfWeek.trim();
            returnValues.add(relativeDayOfWeek);
        }
        return returnValues;
    }

}
