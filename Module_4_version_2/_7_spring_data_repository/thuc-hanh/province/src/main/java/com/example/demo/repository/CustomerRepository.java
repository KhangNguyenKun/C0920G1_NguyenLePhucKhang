package com.example.demo.repository;

import com.example.demo.model.Customer;
import com.example.demo.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Customer findOne(Long id);

    Iterable<Customer> findAllByProvince(Province province);

    void delete(Long id);
}
