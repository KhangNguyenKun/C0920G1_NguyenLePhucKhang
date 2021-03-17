package com.example.customer.repository;

import com.example.customer.entity.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DivisionRepository extends JpaRepository<Division, Integer> {
}
