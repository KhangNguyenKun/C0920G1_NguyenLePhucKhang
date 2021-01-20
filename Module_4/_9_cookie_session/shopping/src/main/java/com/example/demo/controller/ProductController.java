package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping(value = {"","/list"})
    public ModelAndView productList(@PageableDefault(value = 2) Pageable pageable){
        return new ModelAndView("list", "productList", productService.findAll(pageable));
    }
    @GetMapping(value = "/create")
    public String showCreateForm(Model model, HttpServletRequest request) {

        Cookie[] cookies = null;

        cookies = request.getCookies();

        model.addAttribute("cookieValue", cookies);
//        int id, String nameProduct, String price, String describe
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "San pham 1", "1000", "Hoa Lan"));
        productList.add(new Product(2, "San pham 2", "2000", "Hoa Hua"));
        productList.add(new Product(3, "San pham 3", "3000", "Hoa Hong"));
        productList.add(new Product(4, "San pham 4", "4000", "Hoa Huong duong"));


        model.addAttribute("productList", productList);
//        model.addAttribute("student", new Student());

        return "create";
    }

    @PostMapping(value = "/create")
    public String createStudent(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        productService.save(product);
        redirectAttributes.addFlashAttribute("successMsg", "Create product: " + product.getNameProduct() + " success!");
        return "redirect:/list";

    }
    @GetMapping(value = {"","/list"})
    public ModelAndView bagList(@PageableDefault(value = 2) Pageable pageable){
        return new ModelAndView("list", "bagList", productService.findAll(pageable));
    }
}