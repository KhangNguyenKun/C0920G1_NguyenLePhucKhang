package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;
    @Autowired
    CategoryService categoryService;
    @GetMapping("/")
    public String show(Model model, @RequestParam Optional<String> keyword, @PageableDefault(value = 3) Pageable pageable){
        String keywordOld = "";
        if (!keyword.isPresent()) {
            model.addAttribute("blogTitle", blogService.findAllDate(pageable));
            model.addAttribute("category", categoryService.findAll());
            return "/show";
        } else {
            keywordOld = keyword.get();
            model.addAttribute("blogTitle", blogService.findAllInputText(keywordOld, pageable));
            model.addAttribute("keywordOld", keywordOld);
            return "/show";
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(Model model) {

        return "loginPage";
    }
//    @GetMapping("/date")
//    public String showByDate(Model model){
//        model.addAttribute("blogTitle", blogService.findAllDate());
//        model.addAttribute("category", categoryService.findAll());
//        return "/show";
//    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("blog", new Blog());
        model.addAttribute("category", categoryService.findAll());
        return "/create";
    }
    @PostMapping("/save")
    public String save(Model model, Blog blog){
        blogService.save(blog);
        return "redirect:/";
    }
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model){
        model.addAttribute("blogEdit", blogService.findById(id));
        return "/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){
        blogService.save(blog);
//        redirectAttributes.addFlashAttribute("message", "successful");
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirectAttributes){
        blogService.remove(id);
        return "redirect:/";
    }
//    @RequestMapping(value = "/403", method = RequestMethod.GET)
//    public String accessDenied(Model model, Principal principal) {
//
//        if (principal != null) {
//            User loginedUser = (User) ((Authentication) principal).getPrincipal();
//
//            String userInfo = WebUtils.toString(loginedUser);
//
//            model.addAttribute("userInfo", userInfo);
//
//            String message = "Hi " + principal.getName() //
//                    + "<br> You do not have permission to access this page!";
//            model.addAttribute("message", message);
//
//        }
//
//        return "403Page";
//    }
}
