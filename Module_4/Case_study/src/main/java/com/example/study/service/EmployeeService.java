package com.example.study.service;

import com.example.study.model.Customer;
import com.example.study.model.Employee;

import java.util.List;

public interface EmployeeService  {
    List<Employee> findAll();
    Employee findById(int id);
    void save(Employee employee);
    void remove(int id);
}
