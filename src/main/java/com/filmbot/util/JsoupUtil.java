package com.filmbot.util;

import com.filmbot.domain.ScraperConstants;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

public class JsoupUtil implements ScraperConstants {
    public static Document getDocument(String url) throws IOException {
        System.setProperty(HTTP_AGENT, "");

        Document baseDocument;
        if (url.startsWith("http") || url.startsWith("https")) {

            baseDocument = Jsoup.connect(url)
                    .userAgent(ScraperConstants.MOZILLA_USER_AGENT)
                    .get();

        } else if (url.startsWith("file://")) {

            String urlWithoutFile = url.replaceAll("file://", "");
            baseDocument = Jsoup.parse(new File(urlWithoutFile), "UTF-8", "");

        } else {

            throw new IOException("Error parsing the document - no valid input file or url supplied");

        }
        return baseDocument;
    }
}