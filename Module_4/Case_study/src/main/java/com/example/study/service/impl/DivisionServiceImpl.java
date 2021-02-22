package com.example.study.service.impl;

import com.example.study.model.Division;
import com.example.study.model.User;
import com.example.study.repository.DivisionRepository;
import com.example.study.service.DivisionService;
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
