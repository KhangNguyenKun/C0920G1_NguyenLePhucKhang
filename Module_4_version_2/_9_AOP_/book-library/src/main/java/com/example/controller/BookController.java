package com.example.controller;

import com.example.AOP.WriteFile;
import com.example.model.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/")
    public String show(Model model){
        model.addAttribute("book", bookService.findAll());
        return "/show";
    }
    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("book", new Book());
        return "/create";
    }
    @PostMapping("/save")
    public String create( Book book){
        bookService.save(book);
        WriteFile.name = book.getName();
        return "redirect:/";
    }
}
