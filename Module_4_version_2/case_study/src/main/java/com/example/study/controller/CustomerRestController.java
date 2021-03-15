package com.example.study.controller;

import com.example.study.model.Customer;
import com.example.study.service.CustomerService;
import com.example.study.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
@CrossOrigin
public class CustomerRestController {
    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerTypeService customerTypeService;
//    @GetMapping("/home")
//    public Page<Customer> show(){
//        return customerService.findAll(pageable);
//    }
    @GetMapping("/search")
    public List<Customer> search(@RequestParam String name){
        return customerService.findAllInputText(name);
    }
//    @GetMapping("/create")
//    public String create(Model model){
//        model.addAttribute("customer", new Customer());
//        model.addAttribute("customerType",customerTypeService.findAll());
//        return "create";
//    }
//    @PostMapping("/save")
//    public String save(@ModelAttribute Customer customer
//            , RedirectAttributes redirectAttributes, Model model){
//        customerService.save(customer);
//        redirectAttributes.addFlashAttribute("message", "create success");
//        return "redirect:/";
//
//    }
//    @GetMapping("/delete")
//    public String deleteById(@PathVariable int id){
//        customerService.remove(id);
//        return "redirect:";
//    }
}
