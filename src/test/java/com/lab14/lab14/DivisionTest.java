package com.lab14.lab14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Division классын тест.
 */
class DivisionTest {
    
    private Division division;
    
    @BeforeEach
    void setUp() {
        division = new Division();
    }
    
    @Test
    void testDividePositive() {
        double result = division.divide(10.0, 2.0);
        assertEquals(5.0, result, 0.001);
    }
    
    @Test
    void testDivideNegative() {
        double result = division.divide(-10.0, 2.0);
        assertEquals(-5.0, result, 0.001);
    }
    
    @Test
    void testDivideDecimal() {
        double result = division.divide(7.5, 2.5);
        assertEquals(3.0, result, 0.001);
    }
    
    @Test
    void testDivideByZero() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> division.divide(10.0, 0.0)
        );
        assertEquals("Тэгээр хуваах боломжгүй!", exception.getMessage());
    }
    
    @Test
    void testDivideIntegerPositive() {
        long result = division.divideInteger(10.0, 3.0);
        assertEquals(3L, result);
    }
    
    @Test
    void testDivideIntegerNegative() {
        long result = division.divideInteger(-10.0, 3.0);
        assertEquals(-3L, result);
    }
    
    @Test
    void testDivideIntegerByZero() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> division.divideInteger(10.0, 0.0)
        );
        assertEquals("Тэгээр хуваах боломжгүй!", exception.getMessage());
    }
    
    @Test
    void testDivisionNotNull() {
        assertNotNull(division);
    }
}

