package com.example.study.service;

import com.example.study.model.ContractDetail;

import java.util.List;
import java.util.Optional;

public interface ContractDetailService {
    List<ContractDetail> findAll();
    Optional<ContractDetail> findById(int id);
    void save(ContractDetail contractDetail);
    void remove(int id);
}
