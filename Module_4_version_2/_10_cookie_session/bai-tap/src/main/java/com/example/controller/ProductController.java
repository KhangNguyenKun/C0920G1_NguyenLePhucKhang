package com.example.controller;

import com.example.model.Cart;
import com.example.model.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@SessionAttributes("list")
public class ProductController {
    @Autowired
    ProductService productService;
    @ModelAttribute("list")
    public List<Product> setUpCart() {
        return new ArrayList<>();
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
    public String buy(@ModelAttribute("list") List<Product>  list, @PathVariable int id, Model model){
//        HashMap< Cart, Integer> cartList = list;
////        if (cartList != null){
////            cartList = new HashMap<>();
////        }
//        Product product= productService.findById(id);
//        if (product !=null){
//            if (cartList.containsKey(id)){
//                Cart cart= cartList.get();
////                item.setList(product);
//                cart.setQuantity(cart.getQuantity()+1);
//            }
//            else {
//                cartList.entrySet(1, product);
//            }
//        }

        list.add(productService.findById(id));
        model.addAttribute("listABC", list);
        return "/showCart";
    }
    @GetMapping("/showCart")
    public String showCart(@SessionAttribute("list") List<Product>  list, Model model) {
//        String message = "";
//        if (carts == null) {
//            message = "Cart is null!";
//        }
//        model.addAttribute("messageCart", message);
        model.addAttribute("listABC", list);
        return "showCart";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model){
        productService.deleteById(id);
        return "redirect:/";
    }
}
