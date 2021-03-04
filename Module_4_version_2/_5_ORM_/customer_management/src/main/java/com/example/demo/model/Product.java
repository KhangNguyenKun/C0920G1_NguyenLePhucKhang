package com.example.demo.model;


import com.example.demo.annotation.Apple;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Product implements Validator {
    @Id
    private int id;
    @NotBlank(message = "not blank here")
    private String name;
    private String price;

    @Apple
    private String manufacture;

    public Product() {
    }

    public Product(int id, String name, String price, String manufacture) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacture = manufacture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Product product= (Product)target;
        if (product.price.length()<10){
            errors.rejectValue("price","priceValue");
        }
    }
}
