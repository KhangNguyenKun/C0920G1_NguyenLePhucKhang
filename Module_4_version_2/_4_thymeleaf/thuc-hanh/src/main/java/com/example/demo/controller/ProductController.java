package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/show")
    public String showList(Model model) {
        model.addAttribute("showList", productService.findAll());
        return "/show";
    }

//    @PostMapping("/product/save")
//    public String save(Product product, RedirectAttributes redirectAttributes){
//        product.setId((int)(Math.random()*1000));
//        productService.save(product);
//        redirectAttributes.addFlashAttribute("message", "successful");
//        return "redirect:/";
//    }

    @GetMapping("/product/{id}/edit")
    public String edit(@PathVariable int id, Model model){
        model.addAttribute("product", productService.findById(id));
        return "/edit";
    }
    @PostMapping("/edit")
    public String updateProduct(@ModelAttribute Product product, RedirectAttributes redirectAttributes){
        productService.save(product);
        redirectAttributes.addFlashAttribute("message", "update successful");
        return "redirect:/show";
    }
}
