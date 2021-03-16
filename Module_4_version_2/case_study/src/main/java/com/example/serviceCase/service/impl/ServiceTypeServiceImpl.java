package com.example.serviceCase.service.impl;

import com.example.serviceCase.entity.ServiceType;
import com.example.serviceCase.repository.ServiceTypeRepository;
import com.example.serviceCase.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeServiceImpl implements ServiceTypeService {
    @Autowired
    ServiceTypeRepository serviceTypeRepository;
    @Override
    public List<ServiceType> findAll() {
        return serviceTypeRepository.findAll();
    }

    @Override
    public ServiceType findById(int id) {
        return serviceTypeRepository.findById(id).orElse(null);
    }

    @Override
    public void save(ServiceType serviceType) {
         serviceTypeRepository.save(serviceType);
    }

    @Override
    public void remove(int id) {
        serviceTypeRepository.deleteById(id);
    }
}
