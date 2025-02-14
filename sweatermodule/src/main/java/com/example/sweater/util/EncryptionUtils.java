package org.example;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class EncryptionUtils {

    private static final String ALGORITHM = "AES";

    // Генерация ключа
    public static SecretKey generateKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance(ALGORITHM);
        keyGen.init(128);
        return keyGen.generateKey();
    }

    // Шифрование
    public static String encrypt(String data, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedData = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedData);
    }

    // Дешифрование
    public static String decrypt(String encryptedData, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptedData = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
        return new String(decryptedData);
    }

    public static void main(String[] args) {
        try {
            String password = "123";
            // Генерация ключа
            SecretKey secretKey = EncryptionUtils.generateKey();
            // Шифрование пароля
            String encryptedPassword = EncryptionUtils.encrypt(password, secretKey);
            System.out.println("Зашифрованный пароль: " + encryptedPassword);
            // Дешифрование пароля
            String decryptedPassword = EncryptionUtils.decrypt(encryptedPassword, secretKey);
            System.out.println("Расшифрованный пароль: " + decryptedPassword);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




