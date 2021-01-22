package com.example.study.repository;

import com.example.study.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
//    Page<Customer> findAllByNameContaining(String name, Pageable pageable);
}
