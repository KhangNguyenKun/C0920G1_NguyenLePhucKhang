//package com.example.demo.controller;
//
//import com.example.demo.model.Blog;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//@Controller
//public class UserController {
//    @GetMapping("/create")
//    public String showCreate(Model model){
//        model.addAttribute("categoryList",categoryService.findAll());
//        model.addAttribute("blog", new Blog());
//        return "user/create";
//    }
//    @PostMapping("/save")
//    public String save(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){
//        blogService.save(blog);
//        redirectAttributes.addFlashAttribute("message","save success");
//        return "/blog/list";
//    }
//}
