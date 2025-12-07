package com.lab14.lab14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    
    @Autowired
    private CalculatorService calculatorService;
    
    @GetMapping("/")
    public String index() {
        return "calculator";
    }
    
    @PostMapping("/calculate")
    public String calculate(
            @RequestParam double num1,
            @RequestParam double num2,
            @RequestParam String operation,
            Model model) {
        try {
            double result = calculatorService.calculate(num1, num2, operation);
            model.addAttribute("result", result);
            model.addAttribute("num1", num1);
            model.addAttribute("num2", num2);
            model.addAttribute("operation", operation);
            model.addAttribute("error", null);
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
            model.addAttribute("num1", num1);
            model.addAttribute("num2", num2);
            model.addAttribute("operation", operation);

        }
        return "calculator";
    }
}

