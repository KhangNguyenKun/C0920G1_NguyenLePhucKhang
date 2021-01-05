package com.example.controller;

import com.example.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CalculationController {

    @GetMapping(value = "/home")
    public String showCreateForm() {
        return "/input";
    }
    @Autowired
    CalculatorService calculatorService;
    //khai bao doi tuong
    @GetMapping(value = "/save")

    public String getCalculation(Model model, @RequestParam String number1, @RequestParam String number2, @RequestParam String calculation ){
        double firstNumber = 0;
        double secondNumber = 0;
        try {
            firstNumber = Double.parseDouble(number1);
            secondNumber = Double.parseDouble(number2);
        }catch (NumberFormatException e) {
            model.addAttribute("message", "number format exception");
            return "/input";
        }
        double result = calculatorService.calculate(firstNumber, secondNumber, calculation);
        model.addAttribute("calculation", calculation);
        model.addAttribute("firstNumber", firstNumber);
        model.addAttribute("secondNumber", secondNumber);
        model.addAttribute("result", result);
        return "/input";
    }
}
