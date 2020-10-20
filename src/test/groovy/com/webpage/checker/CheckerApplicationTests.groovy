package com.webpage.checker

import spock.lang.Specification
import spock.lang.Unroll

class CheckerApplicationTests extends Specification {
    CheckerService checkerService = new CheckerService()

    def "test audiobooks"() throws IOException {
        when:
        int reviewCount = checkerService.retrieveCount(Checker.AUDIOBOOKS)
        then:
        reviewCount == 4
    }

    def "test ebooks"() throws IOException {
        when:
        int reviewCount = checkerService.retrieveCount(Checker.EBOOKS)
        then:
        reviewCount == 2
    }
}
