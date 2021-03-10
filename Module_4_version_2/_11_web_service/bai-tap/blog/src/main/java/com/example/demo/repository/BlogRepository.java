package com.example.demo.repository;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
    Page<Blog> findAllByTitleContaining(String title, Pageable pageable);
    Page<Blog> findAllByOrderByDateDesc (Pageable pageable);
    List<Blog> findAllByCategory(String category);
 }
