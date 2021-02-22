package com.example.study.service;

import com.example.study.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface EmployeeService  {
    Page<Employee> findAll(Pageable pageable);
    Optional<Employee> findById(Integer id);
    void save(Employee employee);
    void remove(Integer id);
    Page<Employee> findAllInputText(String name, Pageable pageable);
}
