package com.example.study.service;

import com.example.study.model.Service;

import java.util.List;

public interface ServiceService {
    List<Service> findAll();
    Service findById(int id);
    void save(Service service);
    void remove(int id);
}
