package com.example.simplespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class SimplespringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimplespringbootApplication.class, args);
    }

}
