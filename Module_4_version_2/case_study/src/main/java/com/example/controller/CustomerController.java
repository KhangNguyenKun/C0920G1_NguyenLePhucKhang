package com.example.controller;

import com.example.model.Customer;
import com.example.service.CustomerService;
import com.example.service.CustomerTypeService;
import com.example.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.security.Principal;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerTypeService customerTypeService;

    @GetMapping("/")
    public String show(@PageableDefault(size = 4) Pageable pageable, Model model) {
//        User loginedUser = (User) ((Authentication) principal).getPrincipal();

        model.addAttribute("customer", customerService.findAll(pageable));
        model.addAttribute("customerType", customerTypeService.findAll());
        return "/show";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("customerType", customerTypeService.findAll());
        return "create";
    }

        @PostMapping("/save")
    public String save(@Valid @ModelAttribute Customer customer , BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
        new Customer().validate(customer, bindingResult);
        if (bindingResult.hasErrors()){
            model.addAttribute("customerType",customerTypeService.findAll());
            return "/create";
        } else {
            customerService.save(customer);
            redirectAttributes.addFlashAttribute("message", "create success");
            return "redirect:/";
        }
    }

    @GetMapping("{id}/edit")
    public String edit(@PathVariable String id, Model model) {
        model.addAttribute("customerList", customerService.findById(id));
        model.addAttribute("customerTypeId", customerTypeService.findAll());
        return "/edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Customer customer) {
        customerService.save(customer);
        return "redirect:";
    }
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(Model model) {

        return "loginPage";
    }

    @GetMapping("/{id}/deleted")
    public String deleteById(@PathVariable String id) {
        customerService.remove(id);
        return "redirect:";
    }

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String accessDenied(Model model, Principal principal) {

        if (principal != null) {
            User loginedUser = (User) ((Authentication) principal).getPrincipal();

            String userInfo = WebUtils.toString(loginedUser);

//            model.addAttribute("userInfo", userInfo);
//
//            String message = "Hi " + principal.getName() //
//                    + "<br> You do not have permission to access this page!";
//            model.addAttribute("message", message);

        }

        return "403Page";
    }
}
