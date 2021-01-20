package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Bag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String quantity;
    @ManyToMany(mappedBy = "bag")
    List<Product> products;
    public Bag() {
    }

    public Bag(String quantity, int id) {
        this.quantity = quantity;
        this.id = id;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
