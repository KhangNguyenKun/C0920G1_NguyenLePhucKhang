package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.model.Category;
import com.example.demo.service.BlogService;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@RestController
public class BlogController {
    @Autowired
    BlogService blogService;
    @Autowired
    CategoryService categoryService;
    @GetMapping("/")
    public ResponseEntity <Page<Blog>> show(Model model, @RequestParam Optional<String> keyword, @PageableDefault(value = 3) Pageable pageable){
        String keywordOld = "";
        if (!keyword.isPresent()) {
            Page<Blog> blogList =  blogService.findAllDate(pageable);
            model.addAttribute("blogTitle", blogList);
            model.addAttribute("category", categoryService.findAll());
            return new ResponseEntity<Page<Blog>>(blogList, HttpStatus.NO_CONTENT);
        } else {
            keywordOld = keyword.get();
            Page<Blog> blogList =blogService.findAllInputText(keywordOld, pageable);
            model.addAttribute("blogTitle",blogList );
            model.addAttribute("keywordOld", keywordOld);
            return new ResponseEntity<Page<Blog>>(blogList, HttpStatus.OK);
        }
    }

    @GetMapping("/showCategory")
    public ResponseEntity<List<Category>> showCategory(){
        List<Category> categoryList = categoryService.findAll();
        if (categoryList.isEmpty()) {
            return new ResponseEntity<List<Category>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Category>>(categoryList, HttpStatus.OK);
    }

    @GetMapping("/blog/{id}")
    public ResponseEntity<Blog> getBlog(@PathVariable("id") int id) {
        System.out.println("Blog with id " + id);
        Blog blog = blogService.findById(id);
        if (blog == null) {
            System.out.println("Blog with id " + id + " not found");
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Blog>(blog, HttpStatus.OK);
    }

    @GetMapping("/blogOfCategory/{id}")
    public ResponseEntity<List<Blog>> showBlogOCategory(@PathVariable Long id) {
        Category category = categoryService.findById(id);
        List<Blog> blogList = blogService.findAllByCategory(category.getCategory());
        return new ResponseEntity<List<Blog>>(blogList, HttpStatus.OK);
    }

}
