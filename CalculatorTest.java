package com.demo.basics;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {
    private Calculator calc;

    @BeforeMethod
    public void setUp() {
        calc = new Calculator(); // runs before each test method
    }

    @AfterMethod
    public void tearDown() {
        calc = null; // runs after each test method
    }

    // DataProvider: the same test runs once per data row.
    @DataProvider(name = "addData")
    public Object[][] addData() {
        return new Object[][] {
            {1, 2, 3},
            {0, 0, 0},
            {-5, 5, 0},
            {100, 200, 300}
        };
    }

    @Test(dataProvider = "addData")
    public void addShouldReturnSum(int a, int b, int expected) {
        Assert.assertEquals(calc.add(a, b), expected);
    }

    @Test
    public void multiplyShouldReturnProduct() {
        Assert.assertEquals(calc.multiply(4, 5), 20);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void divideByZeroShouldThrow() {
        calc.divide(10, 0);
    }

    @Test
    public void safeDivideShouldReturnDefaultOnZero() {
        Assert.assertEquals(calc.safeDivide(10, 0, -1), -1);
    }

    @DataProvider(name = "describeData")
    public Object[][] describeData() {
        return new Object[][] {
            {5, "positive"},
            {-3, "negative"},
            {0, "zero"}
        };
    }

    @Test(dataProvider = "describeData")
    public void describeShouldClassifyNumber(int number, String expected) {
        Assert.assertEquals(calc.describe(number), expected);
    }
}
