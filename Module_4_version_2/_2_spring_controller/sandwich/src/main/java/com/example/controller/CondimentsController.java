package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CondimentsController {

    @GetMapping("/choose")
    public String show(){
        return "/index";
    }
    @GetMapping("/save")
    public String showList(Model model, @RequestParam String[] condiment ){
        model.addAttribute("list", Arrays.toString(condiment));
        return "/list";
    }
}
