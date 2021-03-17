package com.example.customer.service;

import com.example.customer.entity.ServiceType;
import com.example.customer.repository.ServiceTypeRepository;
import com.example.customer.service.impl.ServiceTypeService;
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
