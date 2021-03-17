package com.example.customer.service.impl;


import com.example.customer.entity.ServiceType;

import java.util.List;

public interface ServiceTypeService {
    List<ServiceType> findAll();
    ServiceType findById(int id);
    void save(ServiceType serviceType);
    void remove(int id);
}
