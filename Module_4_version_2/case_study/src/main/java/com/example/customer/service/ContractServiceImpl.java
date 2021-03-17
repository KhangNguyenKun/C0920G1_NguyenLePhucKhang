package com.example.customer.service;

import com.example.customer.entity.Contract;
import com.example.customer.repository.ContractRepository;
import com.example.customer.service.impl.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    ContractRepository contractRepository;
    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }

    @Override
    public Optional<Contract> findById(int id) {
        return contractRepository.findById(id);
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public void remove(int id) {
        contractRepository.deleteById(id);
    }
}
