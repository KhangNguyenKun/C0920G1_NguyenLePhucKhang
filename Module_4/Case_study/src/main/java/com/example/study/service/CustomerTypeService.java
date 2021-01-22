package com.example.study.service;

import com.example.study.model.CustomerType;

import java.util.List;
import java.util.Optional;

public interface CustomerTypeService {
    List<CustomerType> findAll();
    Optional<CustomerType> findById(int id);
    void save(CustomerType customerType);
    void remove(int id);
}
