package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String pass = bCryptPasswordEncoder.encode("123");
        System.out.println(pass);
    }

}
