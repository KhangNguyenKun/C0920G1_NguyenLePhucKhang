package com.example.service;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CustomerService  {
    List<Customer> findAll();

    Optional<Customer> findById(Long id);

    Object save(Customer customer);

    void remove(Long id);

    //phan trang
    Page<Customer> findAllInputText(String firstName, Pageable pageable);

    Page<Customer> findAll(Pageable pageable);
}
