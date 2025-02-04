package com.example.sweater;

import com.example.sweater.service.PasswordService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"org.example.mypassword", "com.example.sweater"})
@SpringBootApplication
public class Application {

    @Autowired
    private PasswordService passwordService;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}