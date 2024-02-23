package com.example.user

import spock.lang.Specification
import spock.lang.Subject

class UserSpecification extends Specification {

    def "user name is never empty if the user is not initialized"() {
        given: "a not initialized user"
        @Subject
        def user = new User()

        expect: "it has a default name"
        user.name
    }
}
