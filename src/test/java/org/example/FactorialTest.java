package org.example;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void getFactorialPositiveNumberTest() {
        Factorial factorial = new Factorial();
        int actual = factorial.getFactorial(5);
        int expected = 120;
        assertEquals(actual,expected);
    }

    @Test
    public void getFactorialNegativeNumberTest() {
        Factorial factorial = new Factorial();
        int actual = factorial.getFactorial(-5);
        int expected = 0;
        assertEquals(actual,expected);
    }
}