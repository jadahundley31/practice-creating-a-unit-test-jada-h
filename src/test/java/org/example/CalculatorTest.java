package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(20, 10);
        assertEquals(10, result);
    }

    @Test
    public void testSubtractWithZero() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(9, 0);
        assertEquals(9, result);
    }

}
