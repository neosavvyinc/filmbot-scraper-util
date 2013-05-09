/**
 * Created with IntelliJ IDEA.
 * User: adamparrish
 * Date: 5/2/13
 * Time: 11:39 PM
 * To change this template use File | Settings | File Templates.
 */

import com.filmbot.domain.ScraperConstants;
import com.filmbot.domain.Theater;
import com.filmbot.util.JsoupUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class GoogleTheaterScraper implements ScraperConstants {

    public List<Theater> findTheatersForUrl(String url) throws IOException {

        Document baseDocument = JsoupUtil.getDocument(url);

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

        Document baseDocument = JsoupUtil.getDocument(url);

        Elements theater = baseDocument.select(".theater .desc .name");
        Iterator<Element> theaterIterator = theater.iterator();

        while(theaterIterator.hasNext()) {

            Element theaterChild = theaterIterator.next();
            return new Theater(theaterChild.text());

        }

        return null;

    }

}