package com.webpage.checker

import kotlin.Throws
import java.io.IOException
import org.jsoup.Jsoup
import org.springframework.stereotype.Service

@Service
class CheckerService {
    @Throws(IOException::class)
    fun retrieveCount(url: String?): Int {
        val doc = Jsoup.connect(url).get()
        val els = doc.getElementsByClass(Checker.CLASS)
        if (els[0].toString().contains("days-0-7")) {
            val element = els[0].attr("class", "Facets-sectionListItemLink")
            return element.childNode(3).childNode(0).toString().toInt()
        }
        return 0
    }
}