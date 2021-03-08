package com.example.service;

import com.example.model.Cart;
import com.example.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CartService {
    void createCart(Cart cart);
    List<Cart> findAll();
}
