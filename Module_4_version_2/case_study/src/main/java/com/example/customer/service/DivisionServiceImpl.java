package com.example.customer.service;

import com.example.customer.service.impl.DivisionService;
import com.example.customer.entity.Division;
import com.example.customer.repository.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements DivisionService {
    @Autowired
    DivisionRepository divisionRepository;
    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }
}
