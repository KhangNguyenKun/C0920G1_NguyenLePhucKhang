package com.example.study.service;

import com.example.study.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(int id);
    void save(Customer customer);
    void remove(int id);
//    Page<Customer> findAllByNameContaining(String name, Pageable pageable);
}
