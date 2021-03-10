package com.example.demo.service;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface BlogService  {
    List<Blog> findAll();
    void save(Blog product);
    void remove(int id);
    Optional<Blog> findById(int id);
    List<Blog> findAllInputText(String name);
    List<Blog> findAllDate();
}
