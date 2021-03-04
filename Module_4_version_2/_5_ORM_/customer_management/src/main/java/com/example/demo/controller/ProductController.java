package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String showList(Model model) {
        model.addAttribute("showList", productService.findAll());
        return "/show";
    }

    @GetMapping("/product/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("/product/save")
    public String save(@Valid Product product, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        new Product().validate(product, bindingResult);
        if (bindingResult.hasErrors()) {
            return "/create";
        } else {
            product.setId((int) (Math.random() * 1000));

            productService.save(product);
//        redirectAttributes.addFlashAttribute("message", "successful");
            return "redirect:/";
        }
    }

    @GetMapping("/product/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/edit";
    }

    @PostMapping("/product/edit")
    public String updateProduct(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        productService.save(product);
        redirectAttributes.addFlashAttribute("message", "update successful");
        return "redirect:/";
    }

    //    @GetMapping("/product/{id}/delete")
//    public String delete(@PathVariable int id, Model model) {
//        model.addAttribute("product", productService.findById(id));
//        return "/show";
//    }
    @GetMapping("/product/{id}/delete")
    public String delete(@PathVariable int id, RedirectAttributes redirect) {
        productService.remove(id);
        redirect.addFlashAttribute("success", "Removed product successfully!");
        return "redirect:/";
    }
}
