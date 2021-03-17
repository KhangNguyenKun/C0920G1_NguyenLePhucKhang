package com.example.customer.service;

import com.example.customer.entity.UserRole;
import com.example.customer.repository.UserRoleRepository;
import com.example.customer.service.impl.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleImpl implements UserRoleService {
    @Autowired
    UserRoleRepository userRoleRepository;
    @Override
    public void save(UserRole userRole) {
        userRoleRepository.save(userRole);
    }
}
