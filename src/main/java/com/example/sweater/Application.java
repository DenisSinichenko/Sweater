package com.example.sweater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;


@SpringBootApplication
public class Application {

    @Autowired
    private PasswordService passwordService;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}