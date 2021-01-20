package com.example.demo.service;

import com.example.demo.model.Blog;
import com.example.demo.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CategoryService {
    List<Category> findAll();
    List<Category> sortWriteDate(Pageable pageable);
    Category findById(int id);
    void save(Category category);
    void remove(int id);
}
