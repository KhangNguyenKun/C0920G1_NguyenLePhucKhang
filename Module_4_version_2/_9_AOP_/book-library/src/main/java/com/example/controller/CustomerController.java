package com.example.controller;

import com.example.AOP.WriteFile;
import com.example.model.Book;
import com.example.model.Customer;
import com.example.service.BookService;
import com.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;
    @Autowired
    BookService bookService;
    @GetMapping("/{id}/borrow")
    public String borrowNotChoice(@PathVariable int id, RedirectAttributes redirectAttributes, Model model){
        Book book = bookService.findById(id);
        if (book.getQuantity()>0){
            model.addAttribute("book", book);
            return "/rent";
        }
        else {
            redirectAttributes.addFlashAttribute("message", "your book is over");
            return "redirect:/";
        }
    }
    @GetMapping("/{id}/clickForBorrow")
    public String borrowed(@PathVariable int id){
        Book book= bookService.findById(id);
        Customer customer = new Customer();
        customer.setBook(book);
        bookService.rentBook(book);
        customerService.save(customer);
        WriteFile.name = book.getName();
        return "redirect:/";
    }
    @GetMapping("/return")
    public String showRefundBook(){
        return "return";
    }

    @PostMapping("/returnBook")
    public String refundBook(@RequestParam int idRenter , Model model){
        Customer customer = customerService.findById(idRenter);
        if (customer == null){
            model.addAttribute("message","Not found");
            model.addAttribute("idRenter",idRenter);
            return "return";
        }

        bookService.returnBook(customer.getBook());
        customerService.remove(customer);;
        return "redirect:/";
    }
}
