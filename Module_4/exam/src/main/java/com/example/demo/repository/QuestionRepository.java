package com.example.demo.repository;

import com.example.demo.model.Question;
import com.example.demo.model.QuestionType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Integer> {
    Page<Question> findAllByTitleContaining(String name, Pageable pageable);
}
