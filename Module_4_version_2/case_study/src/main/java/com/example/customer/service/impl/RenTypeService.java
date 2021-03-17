package com.example.customer.service.impl;

import com.example.customer.entity.RenType;

import java.util.List;

public interface RenTypeService {
    List<RenType> findAll();
    RenType findById(int id);
    void save(RenType rentType);
    void remove(int id);
}
