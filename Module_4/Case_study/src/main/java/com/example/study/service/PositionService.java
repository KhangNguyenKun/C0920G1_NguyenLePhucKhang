package com.example.study.service;

import com.example.study.model.Position;

import java.util.List;
import java.util.Optional;

public interface PositionService {
    List<Position> findAll();
    Optional<Position> findById(int id);
    void save(Position position);
    void remove(int id);
}
