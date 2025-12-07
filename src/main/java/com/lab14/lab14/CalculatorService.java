package com.lab14.lab14;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    
    public double calculate(double num1, double num2, String operation) {
        return switch (operation) {
            case "add" -> num1 + num2;
            case "subtract" -> num1 - num2;
            case "multiply" -> num1 * num2;
            case "divide" -> {
                if (num2 == 0) {
                    throw new IllegalArgumentException("Тэгээр хуваах боломжгүй!");
                }
                yield num1 / num2;
            }
            default -> throw new IllegalArgumentException("Буруу үйлдэл: " + operation);
        };
    }
}

