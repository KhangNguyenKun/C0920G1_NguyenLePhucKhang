package com.example.customer.service;

import com.example.customer.entity.AppUser;
import com.example.customer.repository.UserRepository;
import com.example.customer.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public List<AppUser> findAll() {
        return userRepository.findAll();
    }

    @Override
    public AppUser findById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void save(AppUser User) {
        userRepository.save(User);
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public String findByUser(String user) {
        return userRepository.findAppUserByUserName(user);
    }
}
