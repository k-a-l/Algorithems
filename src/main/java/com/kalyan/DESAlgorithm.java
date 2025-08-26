package com.kalyan;

import javax.crypto.*;
import java.util.*;
public class DESAlgorithm {
    public static void main(String[] args) throws Exception {
        SecretKey k = KeyGenerator.getInstance("DES")
                .generateKey();
        Cipher c = Cipher.getInstance("DES");
        c.init(Cipher.ENCRYPT_MODE, k);
        byte[] enc = c.doFinal("KALYAN".getBytes());
        System.out.println(Base64.getEncoder().encodeToString(enc));
        c.init(Cipher.DECRYPT_MODE, k);
        System.out.println(new String(c.doFinal(enc)));
    }
}

