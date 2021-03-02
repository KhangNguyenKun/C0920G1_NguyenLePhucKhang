package com.example.demo.service;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface BlogService  {
    Page<Blog> findAll(Pageable pageable);
    void save(Blog product);
    void remove(int id);
    Optional<Blog> findById(int id);
    Page<Blog> findAllInputText(String name, Pageable pageable);
}
