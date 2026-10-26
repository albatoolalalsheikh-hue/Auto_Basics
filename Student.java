package com.demo.basics;

/**
 * OOP: inheritance (extends Person) and polymorphism (overrides introduce()).
 */
public class Student extends Person {
    private final String track;

    public Student(String name, String track) {
        super(name);
        this.track = track;
    }

    public String getTrack() {
        return track;
    }

    @Override
    public String introduce() {
        return super.introduce() + " and I study " + track;
    }
}
