package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CurrencyController {

    @GetMapping("/enterMoney")
    public String showChangeForm() {
        return "/enterMoney";
    }


    @PostMapping(value = "/enterMoney")
    public String changeMoney(@RequestParam(value = "vnd") int  money, Model model){

//        double money =Double.parseDouble(request.getParameter("vnd"));
        double result1 = money*20000;
        model.addAttribute("result", result1);
        return "/result";
    }
}
