package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    public void getFactorialPositiveNumberTest() {
        Factorial factorial = new Factorial();
        int actual = factorial.getFactorial(5);
        int expected = 120;
        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void getFactorialNegativeNumberTest() {
        Factorial factorial = new Factorial();
        int actual = factorial.getFactorial(-5);
        int expected = 0;
        Assertions.assertEquals(actual,expected);
    }
}