package com.example.serviceCase.service.impl;

import com.example.serviceCase.entity.RenType;
import com.example.serviceCase.repository.RentTypeRepository;
import com.example.serviceCase.service.RenTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
