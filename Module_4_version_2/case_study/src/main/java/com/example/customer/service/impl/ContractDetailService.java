package com.example.customer.service.impl;

import com.example.customer.entity.Contract;
import com.example.customer.entity.ContractDetail;

import java.util.List;
import java.util.Optional;

public interface ContractDetailService {
    List<ContractDetail> findAll();
    ContractDetail findById(int id);
    void save(ContractDetail contract);
    void remove(int id);
}
