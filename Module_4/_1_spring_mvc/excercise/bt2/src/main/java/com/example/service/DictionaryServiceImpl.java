package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Override
    public String dictionary(String english) {
        String result;
        switch (english){
            case "one":
                result ="mot";
                break;
            case "two":
                result = "hai";
                break;
            case "three":
                result = "ba";
                break;
            case "four":
                result = "bon";
                break;
            case "five":
                result = "nam";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + english);
        }
        return result;

    }
}
