package com.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;
    @Autowired
    CategoryService categoryService;

    @GetMapping("/rest")
    public ResponseEntity<List<Blog>> show(Model model) {
        List<Blog> blogList = blogService.findAll();
            return new ResponseEntity<List<Blog>>(blogList, HttpStatus.OK);

    }

//    @GetMapping("/search")
//    public String search(Model model, @RequestParam Optional<String> keyword) {
//        String keywordOld = "";
//        if (!keyword.isPresent()) {
//            return "/show";
//        } else {
//            keywordOld = keyword.get();
//            model.addAttribute("blogTitle", blogService.findAllInputText(keywordOld));
//            model.addAttribute("keywordOld", keywordOld);
//            return "/show";
//        }
//    }
//    @GetMapping("/date")
//    public String showByDate(Model model){
//        model.addAttribute("blogTitle", blogService.findAllDate());
//        model.addAttribute("category", categoryService.findAll());
//        return "/show";
//    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("category", categoryService.findAll());
        return "/create";
    }

    @PostMapping("/save")
    public String save(Model model, Blog blog) {
        blogService.save(blog);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("blogEdit", blogService.findById(id));
        return "/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        blogService.save(blog);
//        redirectAttributes.addFlashAttribute("message", "successful");
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirectAttributes) {
        blogService.remove(id);
        return "redirect:/";
    }
}
