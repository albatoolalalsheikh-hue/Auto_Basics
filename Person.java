package com.demo.basics;

/**
 * OOP: a parent class with a constructor, private fields (encapsulation)
 * and a method that subclasses can override.
 */
public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String introduce() {
        return "Hi, I am " + name;
    }
}
