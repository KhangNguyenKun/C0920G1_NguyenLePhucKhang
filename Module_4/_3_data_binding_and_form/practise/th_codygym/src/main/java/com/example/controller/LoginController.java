package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

    @GetMapping("/login")
    public String formLogin(){
        return "login";
    }
    @PostMapping()
    public String getLogin(Model model , @RequestParam String userName, @RequestParam String password) {
        if (userName.equalsIgnoreCase("khang") && password.equalsIgnoreCase("123")) {
            model.addAttribute("userName", userName);
            model.addAttribute("password", password);
            return "index";
        }
        return null;
    }
}
