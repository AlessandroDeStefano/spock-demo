package com.example.user

import spock.lang.Specification

class UserSpecification extends Specification {

    def "user name is never empty"() {
        given: "a not initialized user"
        def user = new User()

        expect: "it has a default name"
        user.name
    }
}
