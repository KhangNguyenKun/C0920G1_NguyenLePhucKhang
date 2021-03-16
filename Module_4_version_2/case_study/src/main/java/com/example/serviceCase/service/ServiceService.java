package com.example.serviceCase.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.serviceCase.entity.Service;

import java.util.List;

public interface ServiceService {
    List<Service> findAll();
    Service findById(int id);
    void save(Service service);
    void remove(int id);

}
