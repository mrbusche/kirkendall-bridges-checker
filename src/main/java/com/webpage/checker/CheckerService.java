package com.webpage.checker;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CheckerService {
    int retrieveCount(String url) throws IOException {
        Document doc = Jsoup.connect(url).get();
        Elements els = doc.getElementsByClass(Checker.CLASS);
        if (els.get(0).toString().contains("days-0-7")) {
            Element element = els.get(0).attr("class", "Facets-sectionListItemLink");
            return Integer.parseInt(element.childNode(3).childNode(0).toString());
        }
        return 0;
    }

}
