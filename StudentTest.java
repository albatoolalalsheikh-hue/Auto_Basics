package com.demo.basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StudentTest {

    @Test
    public void studentShouldIntroduceWithTrack() {
        Student student = new Student("Sara", "Test Automation");
        Assert.assertEquals(student.introduce(), "Hi, I am Sara and I study Test Automation");
    }

    @Test
    public void polymorphismShouldUseSubclassMethod() {
        Person person = new Student("Omar", "Java");
        Assert.assertTrue(person.introduce().contains("Java"));
    }

    @Test
    public void personShouldIntroduceByName() {
        Assert.assertEquals(new Person("Lina").introduce(), "Hi, I am Lina");
    }
}
