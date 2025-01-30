package com.example.sweater.service;

import com.example.sweater.config.DatabaseProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasswordService {
    @Autowired
    private DatabaseProperties databaseProperties;

    private final String secretKey = "сюда секретный ключ";

    public String getEncryptedPassword() throws Exception {
        return EncryptionUtils.encrypt(databaseProperties.getPassword(), secretKey);
    }

    public String getDecryptedPassword() throws Exception {
        return EncryptionUtils.decrypt(databaseProperties.getPassword(), secretKey);
    }
}

