package com.example.controller;

import com.example.model.Cart;
import com.example.model.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@SessionAttributes("list")
public class ProductController {
    @Autowired
    ProductService productService;
    @ModelAttribute("list")
    public Cart setUpCart() {
        return new Cart();
    }

    @GetMapping("/")
    public String show(Model model){
        model.addAttribute("product", productService.findAll());
        return "/show";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("product", new Product());
        return "/create";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute Product product){
        productService.createProduct(product);
        return "redirect:/";
    }
    @GetMapping("/{id}/buy")
    public String buy(@ModelAttribute("list") List<Product> list, @RequestParam int quantity){
        list.add()
    }
}
