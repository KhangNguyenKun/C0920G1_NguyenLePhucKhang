package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public double addition(double a, double b) {
        return a+b;
    }

    @Override
    public double subtraction(double a, double b) {
        return a-b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a*b;
    }

    @Override
    public double division(double a, double b) {
        return a/b;
    }

    @Override
    public double calculate(double a, double b, String cal) {
        double result;
        switch (cal) {
            case "addition":
                result = addition(a, b);
                break;
            case "subtraction":
                result = subtraction(a, b);
                break;
            case "multiplication":
                result = multiplication(a, b);
                break;
            case "division":
                result = division(a, b);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + cal);
        }
        return result;
    }
}
