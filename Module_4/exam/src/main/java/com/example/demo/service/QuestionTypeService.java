package com.example.demo.service;

import com.example.demo.model.QuestionType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface QuestionTypeService {
    List<QuestionType> findAll();
    Optional<QuestionType> findById(int id);
    void save(QuestionType questionType);
    void remove(int id);
    Page<QuestionType> findAllInputText(String name, Pageable pageable);
}
