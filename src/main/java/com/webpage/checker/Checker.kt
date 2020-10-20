package com.webpage.checker

import java.lang.IllegalStateException

class Checker private constructor() {
    companion object {
        const val AUDIOBOOKS = "https://bridges.overdrive.com/bridges-kirkendall/content/collection/37479"
        const val EBOOKS = "https://bridges.overdrive.com/bridges-kirkendall/content/collection/37473"
        const val CLASS = "Facets-sectionListItem  "
    }

    init {
        throw IllegalStateException("Utility class")
    }
}