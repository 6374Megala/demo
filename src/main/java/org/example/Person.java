package org.example;

import com.google.gson.internal.bind.util.ISO8601Utils;

public class Person {
    String name;
    int age;
    String location;

    public Person(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

}
