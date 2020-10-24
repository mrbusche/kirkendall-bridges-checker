package com.webpage.checker

import com.webpage.checker.Checker.Companion.SECTION_LIST_CLASS
import org.jsoup.Jsoup
import org.springframework.stereotype.Service

@Service
class CheckerService {
    fun retrieveNewBookCount(url: String): Int {
        val document = Jsoup.connect(url).get()
        val elements = document.getElementsByClass(SECTION_LIST_CLASS)
        if (elements.first().toString().contains("days-0-7")) {
            val element = elements.first().attr("class", "Facets-sectionListItemLink")
            return element.childNode(3).childNode(0).toString().toInt()
        }
        return 0
    }
}