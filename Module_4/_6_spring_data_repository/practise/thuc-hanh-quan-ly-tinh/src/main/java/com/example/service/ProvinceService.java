package com.example.service;

import com.example.model.Province;

import java.util.List;

public interface ProvinceService  {
    List<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
