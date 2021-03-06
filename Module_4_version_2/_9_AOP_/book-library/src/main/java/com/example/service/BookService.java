package com.example.service;

import com.example.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAll();
    void save(Book category);
    void remove(int id);
    Book findById(int id);
    void rentBook(Book book);
    void returnBook(Book book);
}
