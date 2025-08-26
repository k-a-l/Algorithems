package com.kalyan;

import java.util.Arrays;

public class RailFenceCipher {
    static String encrypt(String txt, int key) {
        StringBuilder[] rails = new StringBuilder[key];
        for (int i = 0; i < key; i++) rails[i] = new StringBuilder();
        int r = 0, dir = 1;

        for (char c : txt.toCharArray()) {
            rails[r].append(c);
            if (r == 0) dir = 1;
            else if (r == key - 1) dir = -1;
            r += dir;
        }

        return String.join("", Arrays.stream(rails)
                .map(StringBuilder::toString).toArray(String[]::new));
    }

    public static void main(String[] args) {
        System.out.println(encrypt("KALYAN", 3));
    }
}
