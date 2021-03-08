package com.example.repository;

import com.example.model.Cart;
import com.example.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
