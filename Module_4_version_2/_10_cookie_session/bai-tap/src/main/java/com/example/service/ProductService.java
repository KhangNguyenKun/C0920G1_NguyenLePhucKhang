package com.example.service;

import com.example.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService  {
    void createProduct(Product product);
    Product findById(Integer id);
    List<Product> findAll();
    void deleteById(int id);
}
