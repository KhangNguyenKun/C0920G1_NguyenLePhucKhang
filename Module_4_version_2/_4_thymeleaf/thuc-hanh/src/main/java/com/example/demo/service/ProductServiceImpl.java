package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    private static Map<Integer,Product> productMap;
    static {
        productMap= new HashMap<>();
        productMap.put(1,new Product("1","Iphone 7","300", "Apple"));
        productMap.put(2,new Product("2","Iphone 8","300", "Apple"));
        productMap.put(3,new Product("3","Iphone x","300", "Apple"));
        productMap.put(4,new Product("4","Iphone 11","300", "Apple"));
        productMap.put(5,new Product("5","Iphone 12","300", "Apple"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);

    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }
}
