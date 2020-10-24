package com.webpage.checker

import spock.lang.Specification

class CheckerApplicationTests extends Specification {
    CheckerService checkerService = new CheckerService()

    def "test audiobooks"() throws IOException {
        when:
        int reviewCount = checkerService.retrieveNewBookCount(Checker.AUDIOBOOKS)
        then:
        reviewCount == 12
    }

    def "test ebooks"() throws IOException {
        when:
        int reviewCount = checkerService.retrieveNewBookCount(Checker.EBOOKS)
        then:
        reviewCount == 12
    }
}
