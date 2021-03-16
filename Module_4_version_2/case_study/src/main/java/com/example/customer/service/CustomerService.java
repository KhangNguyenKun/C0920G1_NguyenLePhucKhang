package com.example.customer.service;

import com.example.customer.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    Customer findById(String id);
    void save(Customer customer);
    void remove(String id);
    Page<Customer> findAllInputText(String name,Pageable pageable);

}
