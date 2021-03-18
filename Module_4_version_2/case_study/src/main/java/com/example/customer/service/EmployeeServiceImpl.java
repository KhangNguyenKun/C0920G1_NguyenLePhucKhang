package com.example.customer.service;

import com.example.customer.service.impl.EmployeeService;
import com.example.customer.entity.Employee;
import com.example.customer.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public Optional<Employee> findById(Integer id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void remove(Integer id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Page<Employee> findAllInputText(String name, Pageable pageable) {
        return employeeRepository.findAllByEmployeeNameContaining(name, pageable);
    }

    @Override
    public boolean checkEmailUnique(String email) {
         List<Employee> list= employeeRepository.findAllByEmployeeEmail(email);
        return list.isEmpty();
    }
}
