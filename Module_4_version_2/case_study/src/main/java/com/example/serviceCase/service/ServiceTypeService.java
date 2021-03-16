package com.example.serviceCase.service;


import com.example.serviceCase.entity.ServiceType;

import java.util.List;
import java.util.Optional;

public interface ServiceTypeService {
    List<ServiceType> findAll();
    ServiceType findById(int id);
    void save(ServiceType serviceType);
    void remove(int id);
}
