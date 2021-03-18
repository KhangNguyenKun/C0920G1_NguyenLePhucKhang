package com.example.customer.service;

import com.example.customer.repository.ServiceRepository;
import com.example.customer.service.impl.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    ServiceRepository serviceRepository;
    @Override
    public List<com.example.customer.entity.Service> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public com.example.customer.entity.Service findById(String id) {
        return serviceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(com.example.customer.entity.Service service) {
        serviceRepository.save(service);
    }

    @Override
    public void remove(String id) {
        serviceRepository.deleteById(id);
    }
}
