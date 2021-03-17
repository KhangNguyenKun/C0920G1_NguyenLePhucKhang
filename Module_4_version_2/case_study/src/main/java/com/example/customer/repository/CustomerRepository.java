package com.example.customer.repository;

import com.example.customer.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
    Page<Customer> findAllByCustomerNameContaining(String name, Pageable pageable);

    @Query("select c from Customer c where concat(c.customerName,c.customerIdCard,c.customerPhone,c.customerEmail) like %?1%")
    Page<Customer> findAllInputTex(String keyword, Pageable pageable);
}
