package com.example.customer.repository;

import com.example.customer.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer> {
}
