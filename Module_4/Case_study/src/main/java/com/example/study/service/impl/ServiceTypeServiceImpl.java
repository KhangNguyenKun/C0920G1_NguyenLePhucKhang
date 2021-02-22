package com.example.study.service.impl;

import com.example.study.model.ServiceType;
import com.example.study.repository.ServiceTypeRepository;
import com.example.study.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceTypeServiceImpl implements ServiceTypeService {
    @Autowired
    ServiceTypeRepository serviceTypeRepository;
    @Override
    public List<ServiceType> findAll() {
        return serviceTypeRepository.findAll();
    }

    @Override
    public Optional<ServiceType> findById(int id) {
        return serviceTypeRepository.findById(id);
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
