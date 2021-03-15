package com.example.service;

import com.example.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    Customer findById(String id);
    void save(Customer customer);
    void remove(String id);
    Page<Customer> findAllInputText(String name,Pageable pageable);

}