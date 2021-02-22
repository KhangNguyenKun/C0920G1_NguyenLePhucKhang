package com.example.demo.service.impl;

import com.example.demo.model.QuestionType;
import com.example.demo.repository.QuestionTypeRepository;
import com.example.demo.service.QuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionTypeServiceImpl implements QuestionTypeService {
    @Autowired
    QuestionTypeRepository questionTypeRepository;
    @Override
    public List<QuestionType> findAll() {
        return questionTypeRepository.findAll();
    }

    @Override
    public Optional<QuestionType> findById(int id) {
        return questionTypeRepository.findById(id);
    }

    @Override
    public void save(QuestionType questionType) {
        questionTypeRepository.save(questionType);
    }

    @Override
    public void remove(int id) {
        questionTypeRepository.deleteById(id);
    }

    @Override
    public Page<QuestionType> findAllInputText(String name, Pageable pageable) {
        return null;
    }
}
