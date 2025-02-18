package com.example.sweater;

import com.example.sweater.service.PasswordService;
import com.sweater.encpassword.EncryptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    @Autowired
    private PasswordService passwordService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}