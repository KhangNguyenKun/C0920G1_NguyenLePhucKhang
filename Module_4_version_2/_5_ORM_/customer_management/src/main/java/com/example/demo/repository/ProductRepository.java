package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository{
    List<Product> findAll();

    Product findById(int id);

    void save(Product product);


    void delete(int id);
}
