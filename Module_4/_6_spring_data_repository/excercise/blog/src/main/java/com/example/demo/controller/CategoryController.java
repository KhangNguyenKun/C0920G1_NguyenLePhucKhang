package com.example.demo.controller;

import com.example.demo.model.Category;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public String showListCategory(Model model){
        model.addAttribute("categoryList",categoryService.findAll());
        return "list";
    }
    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("category",new Category());
        return "/create";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute Category category, RedirectAttributes redirectAttributes){
        categoryService.save(category);
        redirectAttributes.addFlashAttribute("message","create success");
        return "redirect:/category";
    }
    @GetMapping("{id}/update")
    public String showUpdate(@PathVariable int id,Model model){
        model.addAttribute("category",categoryService.findById(id));
        return "/update";
    }
    @PostMapping("/update")
    public String updateCategory(@ModelAttribute Category category,RedirectAttributes redirectAttributes){
        categoryService.save(category);
        redirectAttributes.addFlashAttribute("message","update success");
        return "redirect:/list";
    }
    @GetMapping("/view")
    public String showCategoryById(@PathVariable int id, Model model){
        model.addAttribute("category", categoryService.findById(id));
        return "view";
    }
    @GetMapping("/{id}/delete")
    public String deleteCategory(@PathVariable int id, RedirectAttributes redirectAttributes) {
        categoryService.remove(id);
        redirectAttributes.addFlashAttribute("message","Delete Success!!!");
        return "redirect:/category";
    }
}
