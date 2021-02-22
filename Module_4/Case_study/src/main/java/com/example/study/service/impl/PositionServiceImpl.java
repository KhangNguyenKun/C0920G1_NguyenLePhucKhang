package com.example.study.service.impl;

import com.example.study.model.Position;
import com.example.study.repository.PositionRepository;
import com.example.study.service.PositionService;
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
    public Optional<Position> findById(int id) {
        return positionRepository.findById(id);
    }

    @Override
    public void save(Position position) {
positionRepository.save(position);
    }

    @Override
    public void remove(int id) {
positionRepository.deleteById(id);
    }
}
