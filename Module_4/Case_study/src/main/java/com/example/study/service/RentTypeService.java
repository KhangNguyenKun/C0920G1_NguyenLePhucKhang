package com.example.study.service;

import com.example.study.model.RentType;

import java.util.List;
import java.util.Optional;

public interface RentTypeService  {
    List<RentType> findAll();
    Optional<RentType> findById(int id);
    void save(RentType rentType);
    void remove(int id);
}
