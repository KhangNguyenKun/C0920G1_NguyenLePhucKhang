package com.example.demo.service.impl;

import com.example.demo.model.Question;
import com.example.demo.repository.QuestionRepository;
import com.example.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionRepository questionRepository;
    @Override
    public List<Question> findAll(Pageable pageable) {
        return questionRepository.findAll();
    }

    @Override
    public Optional<Question> findById(int id) {
        return questionRepository.findById(id);
    }

    @Override
    public void save(Question question) {
questionRepository.save(question);
    }

    @Override
    public void remove(int id) {
questionRepository.deleteById(id);
    }

    @Override
    public Page<Question> findAllInputText(String name, Pageable pageable) {
        return questionRepository.findAllByTitleContaining(name, pageable);
    }
}
