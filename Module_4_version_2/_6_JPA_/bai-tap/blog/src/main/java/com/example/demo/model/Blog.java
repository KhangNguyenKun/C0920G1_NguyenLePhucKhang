package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.istack.NotNull;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;

@Entity
public class Blog implements Validator {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String title;
    private String content;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    @JsonBackReference
    private Category category;

    public Blog() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Blog blog=(Blog)target;
        if (blog.content.startsWith("0")){
            errors.rejectValue("content","content.combined");
        }
    }
}
