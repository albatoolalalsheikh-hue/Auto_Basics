package com.demo.basics;

/**
 * Java syntax and methods: variables, operators, if/else, methods with return values,
 * and exception handling (try/catch).
 */
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    // Throws an exception for invalid input (division by zero).
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    // Handles the exception itself with try/catch and returns a safe default.
    public int safeDivide(int a, int b, int defaultValue) {
        try {
            return divide(a, b);
        } catch (IllegalArgumentException e) {
            return defaultValue;
        }
    }

    // if / else if / else
    public String describe(int number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }
}
