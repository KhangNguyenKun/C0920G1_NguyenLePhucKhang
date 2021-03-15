package com.example.study.service;

import com.example.study.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    Customer findById(int id);
    void save(Customer customer);
    void remove(int id);
    List<Customer> findAllInputText(String name);

}
