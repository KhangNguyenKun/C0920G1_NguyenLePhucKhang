package com.example.study.service;

import com.example.study.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    Optional<User> findById(int id);
    void save(User User);
    void remove(int id);
}
