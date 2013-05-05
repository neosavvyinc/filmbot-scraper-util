import com.filmbot.domain.Film;
import com.filmbot.domain.ScraperConstants;
import com.filmbot.domain.Showtime;
import com.filmbot.domain.Theater;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: adamparrish
 * Date: 5/3/13
 * Time: 12:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class GoogleFilmAndShowTimeScraper implements ScraperConstants {

    public List<Film> findFilmsForTheater(Theater theater) throws IOException {

        List<Film> films = new ArrayList<Film>();

        System.setProperty(HTTP_AGENT, "");
        Document baseDocument;

        baseDocument = Jsoup.connect(theater.getSourceUrl())
                .userAgent(MOZILLA_USER_AGENT)
                .get();

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

        System.setProperty(HTTP_AGENT, "");
        Document baseDocument;

        baseDocument = Jsoup.connect(theater.getSourceUrl())
                .userAgent(MOZILLA_USER_AGENT)
                .get();

        String selector = ".theater .showtimes .movie .name"; //selects a movie
        Elements filmElements = baseDocument.select(selector);

        for (Element filmElement : filmElements) {

            if( film.getName().equals(filmElement.text()) ) {

                Elements showtimeElements = filmElement.parent().select(".times span");
                Iterator<Element> filmIterator = showtimeElements.iterator();

                while(filmIterator.hasNext()) {

                    Element showtimeElement = filmIterator.next();
                    System.out.println(showtimeElement.text());


                    String trimmmedShowTime = showtimeElement.text().trim();
                    trimmmedShowTime = trimmmedShowTime.replaceAll("[^\\x00-\\x7F]", "");


                    Pattern p = Pattern.compile("([01]?[0-9]|2[0-3]):[0-5][0-9](am|pm)?");
                    Matcher m = p.matcher(trimmmedShowTime);
                    if( m.matches() ) {
                        showtimes.add(new Showtime(film, showtimeElement.text()));
                    }

                }

                break;

            }

        }

        return showtimes;

    }

}
