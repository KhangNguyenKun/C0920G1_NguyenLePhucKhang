package com.example.customer.controller;

import com.example.customer.entity.Customer;
import com.example.customer.service.CustomerService;
import com.example.customer.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class CustomerRestController {
    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerTypeService customerTypeService;
    @GetMapping("/search")
    public Page<Customer> search(@RequestParam String name, Pageable pageable){
        return customerService.findAllInputText(name, pageable);
    }
}
