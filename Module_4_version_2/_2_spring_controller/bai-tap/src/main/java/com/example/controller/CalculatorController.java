package com.example.controller;

import com.example.service.CalculatorService;
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

    @GetMapping("/show")
    public String showForm() {
        return "/result";
    }

    @GetMapping("/addition")
    public String calculate(@RequestParam String a, @RequestParam String b, @RequestParam String cal, Model model) {
        double firstNumber;
        double secondNumber;
        try {
            firstNumber = Double.parseDouble(a);
            secondNumber = Double.parseDouble(b);
        }catch (NumberFormatException e) {
            model.addAttribute("message", "number format exception");
            return "/result";
        }
        double result;
        result = calculatorService.calculate(firstNumber, secondNumber, cal);
        model.addAttribute("result", result);
        return "/result";
    }
}
