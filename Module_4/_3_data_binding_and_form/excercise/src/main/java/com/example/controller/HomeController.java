package com.example.controller;


import com.example.model.Box;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping(value = "/input")
    public String showForm(Model model) {
        model.addAttribute("box", new Box());
        return "input";
    }
    @PostMapping(value = "/show")
    public String submit(@ModelAttribute Box box, Model model){
        model.addAttribute("languages",box.getLanguages());
        model.addAttribute("pageSize",box.getPageSize());
        model.addAttribute("spamsFilter",box.getSpamsFilter());
        model.addAttribute("signature",box.getSignature());
        return "show";
    }
}
