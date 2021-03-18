package com.example.customer.service;

import com.example.customer.entity.Contract;
import com.example.customer.entity.ContractDetail;
import com.example.customer.repository.ContractDetailRepository;
import com.example.customer.service.impl.ContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailServiceImpl implements ContractDetailService {
    @Autowired
    ContractDetailRepository contractDetailRepository;
    @Override
    public List<ContractDetail> findAll() {
        return contractDetailRepository.findAll();
    }

    @Override
    public ContractDetail findById(int id) {
        return contractDetailRepository.findById(id).orElse(null);
    }

    @Override
    public void save(ContractDetail contract) {
contractDetailRepository.save(contract);
    }

    @Override
    public void remove(int id) {

    }
}
