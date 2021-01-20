package com.example.demo.service;

import com.example.demo.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Page<Product> findAll(Pageable pageable);
    void save(Product product);
    void update(Product product);

}
