package com.kalyan;

import java.security.MessageDigest;

public class MD5Hashing {
    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update("Kalyan MD5".getBytes());
        System.out.println(md.digest().toString());
    }
}
