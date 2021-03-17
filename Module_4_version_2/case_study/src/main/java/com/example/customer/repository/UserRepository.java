package com.example.customer.repository;

import com.example.customer.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Integer> {
    String findAppUserByUserName(String name);
}
