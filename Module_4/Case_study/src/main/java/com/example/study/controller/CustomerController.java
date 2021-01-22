package com.example.study.controller;

import com.example.study.model.Customer;
//import com.example.study.repository.CustomerTypeRepository;
import com.example.study.repository.CustomerTypeRepository;
import com.example.study.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerTypeRepository customerTypeRepository;
    @GetMapping("")
    public String showCustomer(Model model){
        model.addAttribute("customerList", customerService.findAll());
        return "/customer/list";
    }
    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("customer",new Customer());
        model.addAttribute("customerType",customerTypeRepository.findAll());
        return "customer/create";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes){
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("message","create success");
        return "redirect:/customer";
    }
    @GetMapping("{id}/update")
    public String showUpdate(@PathVariable int id, Model model){
        model.addAttribute("customerList",customerService.findById(id));
        model.addAttribute("customerType",customerTypeRepository.findAll());
        return "customer/edit";
    }
    @PostMapping("/update")
    public String updateCustomer(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes){
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("message","update success");
        return "redirect:/customer";
    }
    @GetMapping("/view")
    public String showCategoryById(@PathVariable int id, Model model){
        model.addAttribute("customer", customerService.findById(id));
        return "customer/view";
    }
    @GetMapping("/{id}/delete")
    public String deleteCategory(@PathVariable int id, RedirectAttributes redirectAttributes) {
        customerService.remove(id);
        redirectAttributes.addFlashAttribute("message","Delete Success!!!");
        return "redirect:/customer";
    }
}
