package com.example.service.impl;

import com.example.model.Book;
import com.example.repository.BookRepository;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;
    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public void save(Book category) {
bookRepository.save(category);
    }

    @Override
    public void remove(int id) {
bookRepository.deleteById(id);
    }

    @Override
    public Book findById(int id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void rentBook(Book book) {
        book.setQuantity(book.getQuantity()-1);
        bookRepository.save(book);
    }

    @Override
    public void returnBook(Book book) {
        book.setQuantity(book.getQuantity()+1);
        bookRepository.save(book);
    }
}
