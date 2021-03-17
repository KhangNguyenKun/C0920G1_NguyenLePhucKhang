package com.example.customer.service;

import com.example.customer.service.impl.EducationDegreeService;
import com.example.customer.entity.EducationDegree;
import com.example.customer.repository.EducationDegreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EducationDegreeServiceImpl implements EducationDegreeService {
    @Autowired
    EducationDegreeRepository educationDegreeRepository;
    @Override
    public List<EducationDegree> findAll() {
        return educationDegreeRepository.findAll();
    }
}
