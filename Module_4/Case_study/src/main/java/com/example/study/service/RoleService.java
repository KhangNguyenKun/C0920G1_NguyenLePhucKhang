package com.example.study.service;

import com.example.study.model.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService  {
    List<Role> findAll();
    Optional<Role> findById(int id);
    void save(Role role);
    void remove(int id);
}
