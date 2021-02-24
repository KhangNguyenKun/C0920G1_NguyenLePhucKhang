package com.example.controller;

import com.example.model.Email;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {

    @GetMapping("/create")
    public String show(Model model){
        model.addAttribute("email", new Email());
        return "/index";
    }
    @PostMapping("/create")
    public String showDetail(Model model, @ModelAttribute("email") Email email){
        model.addAttribute("language", email.getLanguages());
        model.addAttribute("pageSize", email.getPageSize());
        model.addAttribute("spamFilter", email.getSpamFilter());
        model.addAttribute("signature", email.getSignature());

        return "/index";
    }
}
