package com.example.study.service.impl;

import com.example.study.model.User;
import com.example.study.repository.UserRepository;
import com.example.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public void save(User user) {
userRepository.save(user);
    }

    @Override
    public void remove(int id) {
userRepository.deleteById(id);
    }
}
