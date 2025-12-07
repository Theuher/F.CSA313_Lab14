package com.lab14.lab14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Multiplication классын тест.
 */
class MultiplicationTest {
    
    private Multiplication multiplication;
    
    @BeforeEach
    void setUp() {
        multiplication = new Multiplication();
    }
    
    @Test
    void testMultiplyPositive() {
        double result = multiplication.multiply(5.0, 3.0);
        assertEquals(15.0, result, 0.001);
    }
    
    @Test
    void testMultiplyNegative() {
        double result = multiplication.multiply(-5.0, 3.0);
        assertEquals(-15.0, result, 0.001);
    }
    
    @Test
    void testMultiplyZero() {
        double result = multiplication.multiply(5.0, 0.0);
        assertEquals(0.0, result, 0.001);
    }
    
    @Test
    void testMultiplyDecimal() {
        double result = multiplication.multiply(2.5, 4.0);
        assertEquals(10.0, result, 0.001);
    }
    
    @Test
    void testMultiplyMultipleEmpty() {
        double result = multiplication.multiplyMultiple();
        assertEquals(1.0, result, 0.001);
    }
    
    @Test
    void testMultiplyMultipleSingle() {
        double result = multiplication.multiplyMultiple(5.0);
        assertEquals(5.0, result, 0.001);
    }
    
    @Test
    void testMultiplyMultipleMultiple() {
        double result = multiplication.multiplyMultiple(2.0, 3.0, 4.0);
        assertEquals(24.0, result, 0.001);
    }
    
    @Test
    void testMultiplyMultipleWithZero() {
        double result = multiplication.multiplyMultiple(2.0, 0.0, 4.0);
        assertEquals(0.0, result, 0.001);
    }
    
    @Test
    void testMultiplicationNotNull() {
        assertNotNull(multiplication);
    }
}

