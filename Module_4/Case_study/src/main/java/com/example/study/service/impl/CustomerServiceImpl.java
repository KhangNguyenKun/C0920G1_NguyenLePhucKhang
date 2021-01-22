package com.example.study.service.impl;

import com.example.study.model.Customer;
import com.example.study.repository.CustomerRepository;
import com.example.study.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(int id) {
        customerRepository.deleteById(id);
    }

//    @Override
//    public Page<Customer> findAllByNameContaining(String name, Pageable pageable) {
//        return customerRepository.findAllByNameContaining(name,pageable);
//    }
}
