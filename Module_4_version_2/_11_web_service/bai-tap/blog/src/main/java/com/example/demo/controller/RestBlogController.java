package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin
@RestController
public class RestBlogController {
    @Autowired
    BlogService blogService;
    @GetMapping("/show")
    public Page<Blog> show(@PageableDefault(size = 4) Pageable pageable){
        return blogService.findAll(pageable);
    }

    @GetMapping("/search")
     public List<Blog> search(@RequestParam String name){
        return blogService.findAllInputText(name);
    }
}
