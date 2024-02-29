package com.example.user


class User {

    String name = 'Paul'
    String surname
    String email
    Integer age

    User() {
    }

    User(String name, Integer age) {
        this.name = name
        this.age = age
    }
}
