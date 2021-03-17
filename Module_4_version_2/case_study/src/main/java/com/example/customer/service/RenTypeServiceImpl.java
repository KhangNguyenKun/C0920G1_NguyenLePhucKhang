package com.example.customer.service;

import com.example.customer.entity.RenType;
import com.example.customer.repository.RentTypeRepository;
import com.example.customer.service.impl.RenTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RenTypeServiceImpl implements RenTypeService {
    @Autowired
    RentTypeRepository rentTypeRepository;
    @Override
    public List<RenType> findAll() {
        return rentTypeRepository.findAll();
    }

    @Override
    public RenType findById(int id) {
        return rentTypeRepository.findById(id).orElse(null);
    }

    @Override
    public void save(RenType rentType) {
        rentTypeRepository.save(rentType);
    }

    @Override
    public void remove(int id) {
        rentTypeRepository.deleteById(id);
    }
}
