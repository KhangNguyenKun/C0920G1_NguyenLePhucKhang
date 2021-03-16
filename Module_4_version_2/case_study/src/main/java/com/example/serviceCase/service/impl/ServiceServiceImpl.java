package com.example.serviceCase.service.impl;

import com.example.serviceCase.repository.ServiceRepository;
import com.example.serviceCase.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    ServiceRepository serviceRepository;
    @Override
    public List<com.example.serviceCase.entity.Service> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public com.example.serviceCase.entity.Service findById(int id) {
        return serviceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(com.example.serviceCase.entity.Service service) {
        serviceRepository.save(service);
    }

    @Override
    public void remove(int id) {
        serviceRepository.deleteById(id);
    }
}
