package com.example.customer.service.impl;

import com.example.customer.entity.Contract;

import java.util.List;
import java.util.Optional;

public interface ContractService {
    List<Contract> findAll();
    Optional<Contract> findById(int id);
    void save(Contract contract);
    void remove(int id);
}
