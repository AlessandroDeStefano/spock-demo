package com.example.user

import spock.lang.Specification


class MathSpecification extends Specification {

    def "maximum of #a and #b is #c, with data table [#iterationIndex]"() {
        expect:
        Math.max(a, b) == c

        where:
        // Data table
        a | b || c
        1 | 3 || 3
        7 | 4 || 7
        0 | 0 || 0
    }

    def "maximum of #a and #b is #c, with data pipes [#iterationIndex]"() {
        expect:
        Math.max(a, b) == c

        where:
        a << [1, 7, 0]
        b << [3, 4, 0]
        c << [3, 7, 0]
    }
}