package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping("/login")
    public String showForm(Model model){
        model.addAttribute("user", new User());
        return "/list";
    }
    @PostMapping("/validateUser")
    public String validation(@Validated @ModelAttribute User user, BindingResult bindingResult, Model model){
        new User().validate(user,bindingResult);
        if (bindingResult.hasErrors()){
            return "/list";
        }
        else {
            model.addAttribute("user", user);
            return "/result";
        }
    }
}
