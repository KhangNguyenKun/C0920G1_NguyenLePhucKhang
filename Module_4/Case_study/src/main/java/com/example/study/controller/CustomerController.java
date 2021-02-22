package com.example.study.controller;

import com.example.study.model.Customer;
//import com.example.study.repository.CustomerTypeRepository;
import com.example.study.model.Employee;
import com.example.study.repository.CustomerTypeRepository;
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
import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerTypeService customerTypeService;
    @GetMapping({"", "/list"})
    public String listCustomer(Model model, @RequestParam Optional<String> keyword, @PageableDefault(value = 3) Pageable pageable) {
        String keywordOld = "";
        if (!keyword.isPresent()) {
            model.addAttribute("customerList", customerService.findAll(pageable));
            return "/customer/list";
        } else {
            keywordOld = keyword.get();
            model.addAttribute("customerList", customerService.findAllInputText(keywordOld, pageable));
            model.addAttribute("keywordOld", keywordOld);
            return "/customer/list";
        }
    }
//    @GetMapping({"", "/list"})
//    public String listCustomer(Model model, @PageableDefault(value = 3) Pageable pageable) {
//            model.addAttribute("customerList", customerService.findAll(pageable));
//            return "/customer/list";
//    }
    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("customer",new Customer());
        model.addAttribute("customerType",customerTypeService.findAll());
        return "customer/create";
    }
    @PostMapping("/save")
    public String save(@Valid @ModelAttribute Customer customer , BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
//        new Customer().validate(customer, bindingResult);
        if (bindingResult.hasErrors()){
            model.addAttribute("customerType",customerTypeService.findAll());
            return "customer/create";
        } else {
            customerService.save(customer);
            redirectAttributes.addFlashAttribute("message", "create success");
            return "redirect:/customer";
        }
    }
    @GetMapping("{id}/update")
    public String showUpdate(@PathVariable int id, Model model){
        model.addAttribute("customerList",customerService.findById(id));
        model.addAttribute("customerType",customerTypeService.findAll());
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
    @GetMapping("/delete")
    public String deleteCategory(@RequestParam int id, RedirectAttributes redirectAttributes) {
        customerService.remove(id);
        redirectAttributes.addFlashAttribute("message","Delete Success!!!");
        return "redirect:/customer";
    }
}
