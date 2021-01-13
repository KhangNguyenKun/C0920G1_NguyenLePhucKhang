package com.example.controller;

import com.example.model.Customer;
import com.example.service.CustomerService;
import com.example.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.data.domain.Pageable;


@RequestMapping("/customer")
@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ProvinceService provinceService;
    @GetMapping({"","/list"})
    public String listCustomer(Model model,@PageableDefault(value = 2) Pageable pageable){
        model.addAttribute("customerList",customerService.findAll( pageable));
        return "customer/list";
    }
    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("provinceList",provinceService.findAll());
        model.addAttribute("customer",new Customer());
        return "/create";
    }
    @PostMapping("/save")
    public String saveCustomer(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes){
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("message", "created success!!");
        return "redirect:/customer/";
    }
    @GetMapping("/{id}/update")
    public String update(@PathVariable Long id, Model model){
        model.addAttribute("provinceList",provinceService.findAll());
        model.addAttribute("customer",customerService.findById(id));
        return "customer/edit";
    }
    @PostMapping("/update")
    public String afterUpdate(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes){
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("message","update success");
        return "redirect:/customer";
    }
    @GetMapping("/{id}/view")
    public String showById(@PathVariable Long id, Model model){
        model.addAttribute("customer",customerService.findById(id));
        return "customer/view";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes redirectAttributes){
        customerService.remove(id);
        redirectAttributes.addFlashAttribute("message", "deleted success");
        return "redirect:/customer/";
    }

}
