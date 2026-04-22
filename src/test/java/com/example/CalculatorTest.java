package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {

    /**
     * Rigorous Test :-)
     */
    Calculator cal = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(3, cal.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, cal.subtract(5, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(20, cal.multiply(4, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(5, cal.divide(10, 2));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            cal.divide(10, 0);
        });
    }
}
