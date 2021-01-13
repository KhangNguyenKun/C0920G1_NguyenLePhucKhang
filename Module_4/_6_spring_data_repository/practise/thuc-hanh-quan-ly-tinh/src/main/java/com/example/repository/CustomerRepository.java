package com.example.repository;

import com.example.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.PagingAndSortingRepository;

@EnableJpaRepositories

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Page<Customer> findAllByFirstNameContaining(String firstName, Pageable pageable);

}
