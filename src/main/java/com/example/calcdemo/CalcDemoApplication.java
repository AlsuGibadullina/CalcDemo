package com.example.calcdemo;

import org.example.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcDemoApplication {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add();
        SpringApplication.run(CalcDemoApplication.class, args);

    }

}
