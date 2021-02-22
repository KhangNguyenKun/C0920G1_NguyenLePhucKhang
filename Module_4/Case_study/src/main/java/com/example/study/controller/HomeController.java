package com.example.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String showHome(){
        return "home/index";
    }
    @GetMapping("/403")
    public String eroeeerefewdsf(){
        return "home/error";
    }
}
