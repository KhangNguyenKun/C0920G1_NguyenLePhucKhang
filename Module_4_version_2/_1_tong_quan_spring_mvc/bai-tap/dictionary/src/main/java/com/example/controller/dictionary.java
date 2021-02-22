package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class dictionary {

    @RequestMapping(value = "/input", method = RequestMethod.GET)
    public String show(){
        return "/input";
    }

    @GetMapping(value = "/output")
    public String  answer(@RequestParam(value = "word") String word, Model model){
        List<String> list = new  ArrayList<>();
        list.add("dog");
        list.add("cat");
        list.add("bird");
        list.add("rat");

        List<String> listVN = new  ArrayList<>();
        listVN.add("cho");
        listVN.add("meo");
        listVN.add("chim");
        listVN.add("chuot");
        for (int i = 0; i<list.size(); i++){
            if (word.equals(list.get(i)))
            {
                model.addAttribute("answer", listVN.get(i) );
                break;
            }
            else {
                model.addAttribute("answer", "not found" );
            }
        }
        return "/output";
    }
}
