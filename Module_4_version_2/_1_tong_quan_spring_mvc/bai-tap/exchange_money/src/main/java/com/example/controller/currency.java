package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class currency {

    @RequestMapping(value = "/enterMoney", method = RequestMethod.GET)
    public String showChangeForm() {
        return "/enterMoney";
    }
    @RequestMapping(value = "/enterMoney", method = RequestMethod.POST)
    public String changeMoney(@RequestParam(value = "vnd") int  money, Model model){

//        double money =Double.parseDouble(request.getParameter("vnd"));
        double result = money*20000;
        model.addAttribute("result", result);
        return "/result";
    }
}
