package com.example.calcdemo;

import org.example.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private Calculator calculator;


    public CalculatorController(Calculator calculator){
        this.calculator = calculator;
    }

    @GetMapping("/add")
    public int add(int a, int b){
        return a+b;
    }
}
