package com.example.study.service.impl;

import com.example.study.model.CustomerType;
import com.example.study.repository.CustomerTypeRepository;
import com.example.study.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {
    @Autowired
    CustomerTypeRepository customerTypeRepository;
    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }

    @Override
    public Optional<CustomerType> findById(int id) {
        return customerTypeRepository.findById(id);
    }

    @Override
    public void save(CustomerType customerType) {
        customerTypeRepository.save(customerType);
    }

    @Override
    public void remove(int id) {
        customerTypeRepository.deleteById(id);
    }
}
