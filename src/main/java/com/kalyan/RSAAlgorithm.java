package com.kalyan;

import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.util.Base64;

public class RSAAlgorithm {
    public static void main(String[] args) throws Exception {
        KeyPair p = KeyPairGenerator.getInstance("RSA").generateKeyPair();
        Cipher c = Cipher.getInstance("RSA");
        c.init(Cipher.ENCRYPT_MODE, p.getPublic());
        byte[] enc = c.doFinal("KALYAN RSA".getBytes());
        System.out.println(Base64.getEncoder().encodeToString(enc));
        c.init(Cipher.DECRYPT_MODE, p.getPrivate());
        System.out.println(new String(c.doFinal(enc)));
    }

}
