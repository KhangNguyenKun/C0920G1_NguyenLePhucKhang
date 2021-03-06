package com.example.cart.service;

import com.example.cart.model.Cart;

import java.util.List;

public interface CartService {
    List<Cart> findAll();

    Cart findById(int id);

    void save(Cart cart);

    void remove(int id);
}
