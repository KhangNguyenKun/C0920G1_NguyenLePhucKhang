package com.example.demo.service;

import com.example.demo.model.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface QuestionService {
    List<Question> findAll(Pageable pageable);
    Optional<Question> findById(int id);
    void save(Question question);
    void remove(int id);
    Page<Question> findAllInputText(String name, Pageable pageable);
}
