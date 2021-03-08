package com.example.service;

import com.example.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService  {
    void createProduct(Product product);
    Product findById(Integer id);
    List<Product> findAll();
}
