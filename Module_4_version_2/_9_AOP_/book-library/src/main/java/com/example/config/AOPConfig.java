package com.example.config;

import com.example.AOP.WriteFile;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AOPConfig {
    @Bean
    public WriteFile writeFile(){
        return new WriteFile();
    }
}