package com.webpage.checker

import org.jsoup.Jsoup
import org.springframework.stereotype.Service

@Service
class CheckerService {
    companion object {
        private const val SECTION_LIST_CLASS = "Facets-sectionListItem  "
        private const val SECTION_LIST_ITEM_CLASS = "Facets-sectionListItemLink"

        fun retrieveNewBookCount(url: String): Int {
            val document = Jsoup.connect(url).get()
            val elements = document.getElementsByClass(SECTION_LIST_CLASS)
            if (elements.first().toString().contains("days-0-7")) {
                val element = elements?.first()?.attr("class", SECTION_LIST_ITEM_CLASS)
                return element.childNode(3).childNode(0).toString().replace(",","").toInt()
            }
            return 0
        }
    }
}
