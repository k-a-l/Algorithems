package com.kalyan;

import javax.crypto.*;
import java.util.*;
public class AESAlgorithm {
    public static void main(String[] args) throws Exception {
        SecretKey k = KeyGenerator.getInstance("AES")
                .generateKey();
        Cipher c = Cipher.getInstance("AES");
        c.init(Cipher.ENCRYPT_MODE, k);
        byte[] enc = c.doFinal("KALYANAES".getBytes());
        System.out.println(Base64.getEncoder().encodeToString(enc));
        c.init(Cipher.DECRYPT_MODE, k);
        System.out.println(new String(c.doFinal(enc)));
    }
}

