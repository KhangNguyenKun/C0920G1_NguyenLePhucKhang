package com.example.customer.service.impl;

import com.example.customer.entity.AppUser;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<AppUser> findAll();
    AppUser findById(int id);
    void save(AppUser User);
    void remove(int id);
    String findByUser(String user);
}
