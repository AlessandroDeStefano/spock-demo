package com.example.user

import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Unroll

class UserSpecification extends Specification {

    def "user name is never empty if the user is not initialized"() {
        given: "a not initialized user"
        @Subject
        def user = new User()

        expect: "it has a default name"
        user.name
    }

    @Unroll("#featureName [#iterationIndex] (#name is #age years old)")
    def "age should be set properly"() {
        given:
        def user = new User(name, age)

        expect:
        user.age == age

        where:
        name << ['John', 'Paul', 'Jones']
        age << [15, 22, 33]
    }
}
