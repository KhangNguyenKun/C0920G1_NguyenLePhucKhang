package com.example.customer.service;

import com.example.customer.entity.Position;
import com.example.customer.repository.PositionRepository;
import com.example.customer.service.impl.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    PositionRepository positionRepository;

    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }

    @Override
    public Position findById(int id) {
        return positionRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void save(Position position) {

    }
}
