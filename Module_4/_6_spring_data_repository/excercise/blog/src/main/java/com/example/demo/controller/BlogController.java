package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.model.Category;
import com.example.demo.service.BlogService;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CategoryService categoryService;
    @GetMapping({"","/list"})
    public String listBlog(Model model, @PageableDefault(value = 5)Pageable pageable){
        model.addAttribute("blogList", blogService.findAll(pageable));
        return "blog/list";
    }
    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("categoryList",categoryService.findAll());
        model.addAttribute("blog", new Blog());
        return "blog/vreate";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message","save success");
        return "/blog/list";
    }
    @GetMapping("/update")
    public String updateBlog(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){

        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message","update success");
        return "redirect:/list";
    }
    @GetMapping("/{id}/view")
    public String showBlogByID(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "/blog/view";
    }

    @GetMapping("/{id}/delete")
    public String deleteBlog(@PathVariable int id, RedirectAttributes redirectAttributes) {
        blogService.remove(id);
        redirectAttributes.addFlashAttribute("message", "Delete Success!!!");
        return "redirect:/blog/";
    }

    @PostMapping("/search")
    public ModelAndView searchByText(@RequestParam String inputSearch, @PageableDefault(value = 5) Pageable pageable) {
        return new ModelAndView("blog/list", "blogList", blogService.findAllInputText(inputSearch, pageable));
    }
}
