package com.example.service;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorServiceTest {

    @Test
    public void testAdd() {
        CalculatorService calc = new CalculatorService();
        assertEquals(15, calc.add(10, 5));
    }

    @Test
    public void testMultiply() {
        CalculatorService calc = new CalculatorService();
        assertEquals(50, calc.multiply(10, 5));
    }

    @Test
    public void testSubtract() {
        CalculatorService calc = new CalculatorService();
        assertEquals(5, calc.subtract(10, 5));
    }

    @Test
    public void testDivide() {
        CalculatorService calc = new CalculatorService();
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    public void testModulo() {
        CalculatorService calc = new CalculatorService();
        assertEquals(1, calc.modulo(10, 3));
    }

    @Test
    public void testPower() {
        CalculatorService calc = new CalculatorService();
        assertEquals(8, calc.power(2, 3));
    }
}
