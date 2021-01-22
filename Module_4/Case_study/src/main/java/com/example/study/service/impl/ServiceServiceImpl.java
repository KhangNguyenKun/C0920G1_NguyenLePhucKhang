package com.example.study.service.impl;

import com.example.study.model.Service;
import com.example.study.repository.ServiceRepository;
import com.example.study.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    ServiceRepository serviceRepository;
    @Override
    public List<Service> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Service findById(int id) {
        return serviceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Service service) {
        serviceRepository.save(service);
    }

    @Override
    public void remove(int id) {
        serviceRepository.deleteById(id);
    }
}
