package com.example.customer.service.impl;

import com.example.customer.entity.Service;

import java.util.List;

public interface ServiceService {
    List<Service> findAll();
    Service findById(int id);
    void save(Service service);
    void remove(int id);

}
