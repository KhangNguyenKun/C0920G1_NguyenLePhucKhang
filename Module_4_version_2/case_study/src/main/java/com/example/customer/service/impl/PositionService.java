package com.example.customer.service.impl;

import com.example.customer.entity.Position;

import java.util.List;
import java.util.Optional;

public interface PositionService {
    List<Position> findAll();
   Position findById(int id);
    void save(Position position);
    void remove(int id);
}
