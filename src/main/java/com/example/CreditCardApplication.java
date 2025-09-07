package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.modulith.Modulith;

@SpringBootApplication
@Modulith(name = "CreditCardApplication")
public class CreditCardApplication {
    public static void main(String[] args) {
        SpringApplication.run(CreditCardApplication.class, args);
    }
}
