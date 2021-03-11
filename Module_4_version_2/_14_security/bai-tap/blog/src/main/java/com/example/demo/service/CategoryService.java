package com.example.demo.service;

import com.example.demo.model.Blog;
import com.example.demo.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CategoryService  {
    List<Category> findAll();
    void save(Category category);
    void remove(Long id);
    Optional<Category> findById(int id);
}
