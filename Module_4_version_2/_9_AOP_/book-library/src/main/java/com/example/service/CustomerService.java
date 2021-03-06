package com.example.service;

import com.example.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAll();
    void save(Customer category);
    void remove(Customer customer);
    Customer findById(int id);
}
