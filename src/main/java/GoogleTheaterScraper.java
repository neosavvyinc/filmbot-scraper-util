/**
 * Created with IntelliJ IDEA.
 * User: adamparrish
 * Date: 5/2/13
 * Time: 11:39 PM
 * To change this template use File | Settings | File Templates.
 */

import com.filmbot.domain.Theater;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;


public class GoogleTheaterScraper {

    public List<Theater> findTheatersForUrl(String url) throws IOException {

        System.setProperty("http.agent", "");
        Document baseDocument;

        baseDocument = Jsoup.connect(url)
                .userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:5.0) Gecko/20100101 Firefox/5.0")
                .get();

        Elements theater = baseDocument.select(".theater .desc .name");
        Iterator<Element> theaterIterator = theater.iterator();

        ArrayList<Theater> theatersFound = new ArrayList<Theater>();

        while(theaterIterator.hasNext()) {

            Element theaterChild = theaterIterator.next();
            System.out.println(theaterChild.text());
            theatersFound.add(new Theater(theaterChild.text()));

        }

        return theatersFound;

    }

    public Theater findFirstTheaterForUrl(String url) throws IOException {

        System.setProperty("http.agent", "");
        Document baseDocument;

        baseDocument = Jsoup.connect(url)
                .userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:5.0) Gecko/20100101 Firefox/5.0")
                .get();

        Elements theater = baseDocument.select(".theater .desc .name");
        Iterator<Element> theaterIterator = theater.iterator();

        while(theaterIterator.hasNext()) {

            Element theaterChild = theaterIterator.next();
            return new Theater(theaterChild.text());

        }

        return null;

    }

}