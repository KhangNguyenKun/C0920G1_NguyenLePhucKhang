package com.example.demo.service;

import com.example.demo.model.Blog;

import java.util.List;
import java.util.Optional;

public interface BlogService  {
    List<Blog> findAll();
    void save(Blog product);
    void remove(int id);
    Optional<Blog> findById(int id);
}
