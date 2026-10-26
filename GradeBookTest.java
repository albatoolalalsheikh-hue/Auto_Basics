package com.demo.basics;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GradeBookTest {
    private GradeBook book;

    @BeforeMethod
    public void setUp() {
        book = new GradeBook();
    }

    @Test
    public void listShouldKeepDuplicates() {
        book.addScore(90);
        book.addScore(90);
        Assert.assertEquals(book.getScores().size(), 2);
    }

    @Test
    public void setShouldRemoveDuplicates() {
        book.addScore(90);
        book.addScore(90);
        book.addScore(80);
        Assert.assertEquals(book.uniqueScores().size(), 2);
    }

    @Test
    public void averageShouldBeCalculated() {
        book.addScore(80);
        book.addScore(100);
        Assert.assertEquals(book.average(), 90.0, 0.001);
    }

    @Test
    public void mapShouldKeepLatestValueForKey() {
        book.setStudentScore("A", 1);
        book.setStudentScore("A", 2);
        Assert.assertEquals(book.getStudentScore("A"), 2);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void unknownStudentShouldThrow() {
        book.getStudentScore("Nobody");
    }
}
