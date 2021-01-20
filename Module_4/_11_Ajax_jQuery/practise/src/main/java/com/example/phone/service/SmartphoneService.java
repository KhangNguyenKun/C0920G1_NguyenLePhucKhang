package com.example.phone.service;

import com.example.phone.model.SmartPhone;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface SmartphoneService {
    Iterable<SmartPhone> findAll();
    Optional findById(Integer id);
    SmartPhone save(SmartPhone phone);
    Optional remove(Integer id);
}
