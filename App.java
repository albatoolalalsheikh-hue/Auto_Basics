package com.demo.basics;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("2 + 3 = " + calc.add(2, 3));
        System.out.println("10 / 0 (safe) = " + calc.safeDivide(10, 0, -1));

        Person student = new Student("Sara", "Test Automation");
        System.out.println(student.introduce());

        GradeBook book = new GradeBook();
        book.addScore(80);
        book.addScore(90);
        book.addScore(90);
        System.out.println("Average: " + book.average());
        System.out.println("Unique scores: " + book.uniqueScores());
    }
}
