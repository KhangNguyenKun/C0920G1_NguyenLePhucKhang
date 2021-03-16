package com.example.serviceCase.service;

import com.example.serviceCase.entity.RenType;

import java.util.List;
import java.util.Optional;

public interface RenTypeService {
    List<RenType> findAll();
    RenType findById(int id);
    void save(RenType rentType);
    void remove(int id);
}
