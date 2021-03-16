package com.example.serviceCase.repository;

import com.example.serviceCase.entity.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceTypeRepository extends JpaRepository<ServiceType, Integer> {
}
