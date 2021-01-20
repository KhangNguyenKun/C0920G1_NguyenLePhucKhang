package com.example.phone.service;

import com.example.phone.model.SmartPhone;
import com.example.phone.repository.SmartPhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SmartPhoneServiceImpl implements SmartphoneService {

    @Autowired
    SmartPhoneRepository smartPhoneRepository;
    @Override
    public Iterable<SmartPhone> findAll() {
        return smartPhoneRepository.findAll();
    }

    @Override
    public Optional findById(Integer id) {
        Optional smartPhone= smartPhoneRepository.findById(id);
        if (smartPhone == null){
            return null;
        }
        return smartPhone;
    }

    @Override
    public SmartPhone save(SmartPhone phone) {
        return (SmartPhone) smartPhoneRepository.save(phone);
    }

    @Override
    public Optional remove(Integer id) {
        Optional smartPhone= findById(id);
        smartPhoneRepository.delete(smartPhone);
        return smartPhone;

    }
}
