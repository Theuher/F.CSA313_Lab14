package com.lab14.lab14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * CalculatorService классын тест.
 */
class CalculatorServiceTest {
    
    private CalculatorService calculatorService;
    
    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorService();
    }
    
    @Test
    void testAdd() {
        double result = calculatorService.calculate(5.0, 3.0, "add");
        assertEquals(8.0, result, 0.001);
    }
    
    @Test
    void testSubtract() {
        double result = calculatorService.calculate(5.0, 3.0, "subtract");
        assertEquals(2.0, result, 0.001);
    }
    
    @Test
    void testMultiply() {
        double result = calculatorService.calculate(5.0, 3.0, "multiply");
        assertEquals(15.0, result, 0.001);
    }
    
    @Test
    void testDivide() {
        double result = calculatorService.calculate(10.0, 2.0, "divide");
        assertEquals(5.0, result, 0.001);
    }
    
    @Test
    void testDivideByZero() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> calculatorService.calculate(10.0, 0.0, "divide")
        );
        assertEquals("Тэгээр хуваах боломжгүй!", exception.getMessage());
    }
    
    @Test
    void testInvalidOperation() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> calculatorService.calculate(10.0, 2.0, "invalid")
        );
        assertEquals("Буруу үйлдэл: invalid", exception.getMessage());
    }
    
    @Test
    void testCalculatorServiceNotNull() {
        assertNotNull(calculatorService);
    }
}

