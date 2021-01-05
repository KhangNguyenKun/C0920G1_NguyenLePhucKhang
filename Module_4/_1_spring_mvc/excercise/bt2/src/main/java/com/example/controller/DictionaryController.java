package com.example.controller;

import com.example.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class DictionaryController {

    @GetMapping(value = "/home")
    public String showForm() {
        return "/input";
    }
    @Autowired
    DictionaryService dictionaryService;

    @GetMapping(value = "/dictionary")
    public String getDictionary(Model model, @RequestParam String english){
        String result = dictionaryService.dictionary(english);
        model.addAttribute("meaning", result);
        return "/input";
    }
}
