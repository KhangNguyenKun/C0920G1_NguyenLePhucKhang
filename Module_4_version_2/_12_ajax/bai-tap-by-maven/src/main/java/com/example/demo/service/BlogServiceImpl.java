package com.example.demo.service.impl;

import com.example.demo.model.Blog;
import com.example.demo.repository.BlogRepository;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogRepository blogRepository;


    @Override
    public List<Blog> findAll( ) {
        return blogRepository.findAll();
    }

    @Override
    public void save(Blog product) {
        blogRepository.save(product);
    }

    @Override
    public void remove(int id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Optional<Blog> findById(int id) {
        return blogRepository.findById(id);
    }

    @Override
    public List<Blog> findAllInputText(String name) {
        return blogRepository.findAllByTitleContaining(name);
    }

    @Override
    public List<Blog> findAllDate() {
        return blogRepository.findAllByOrderByDateDesc();
    }


}
