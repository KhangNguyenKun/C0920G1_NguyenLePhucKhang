package com.example.study.service;

import com.example.study.model.ServiceType;

import java.util.List;
import java.util.Optional;

public interface ServiceTypeService {
    List<ServiceType> findAll();
    Optional<ServiceType> findById(int id);
    void save(ServiceType serviceType);
    void remove(int id);
}
