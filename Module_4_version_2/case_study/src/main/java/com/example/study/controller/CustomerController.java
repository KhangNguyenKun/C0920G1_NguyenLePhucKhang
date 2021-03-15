package com.example.study.controller;

import com.example.study.model.Customer;
import com.example.study.model.CustomerType;
import com.example.study.service.CustomerService;
import com.example.study.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerTypeService customerTypeService;
    @GetMapping("")
    public String show(@PageableDefault(size = 4) Pageable pageable, Model model){
        model.addAttribute("customer", customerService.findAll(pageable));
        model.addAttribute("customerType", customerTypeService.findAll());
        return "/show";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("customer", new Customer());
        model.addAttribute("customerType",customerTypeService.findAll());
        return "create";
    }
    @PostMapping("/save")
    public String save( @ModelAttribute Customer customer
           , RedirectAttributes redirectAttributes, Model model){
            customerService.save(customer);
            redirectAttributes.addFlashAttribute("message", "create success");
            return "redirect:/";

    }
    @GetMapping("/delete")
    public String deleteById(@PathVariable int id){
        customerService.remove(id);
        return "redirect:";
    }
}
