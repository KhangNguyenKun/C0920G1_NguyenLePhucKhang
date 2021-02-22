package com.example.study.service;

import com.example.study.model.AttachService;

import java.util.List;
import java.util.Optional;

public interface AttachServiceService  {
    List<AttachService> findAll();
    Optional<AttachService> findById(int id);
    void save(AttachService attachService);
    void remove(int id);
}
