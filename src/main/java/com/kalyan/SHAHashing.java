package com.kalyan;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHAHashing {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest sha = MessageDigest.getInstance("SHA-256");
        sha.update("Kalyan".getBytes());
        byte[] digest = sha.digest();
        System.out.println(digest);

    }
}
