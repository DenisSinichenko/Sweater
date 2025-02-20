package com.example.sweater.service;

import com.example.sweater.service.impl.IPasswordService;

//import org.example.EncryptionUtils;
import com.sweater.encpassword.EncryptionUtils;
import org.springframework.stereotype.Service;
import javax.crypto.SecretKey;

@Service
public class PasswordService implements IPasswordService {

    private SecretKey secretKey;
    //todo что за конструкция {}  и для чего она здесь?
    {
        try {
            secretKey = EncryptionUtils.generateKey();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getDecryptedPassword() throws Exception {
        //return EncryptionUtils.decrypt(databaseProperties.getPassword(), secretKey);
        return EncryptionUtils.decrypt("sj3KN7QiOxWi29KAb8CrSA==", secretKey);
    }
}



