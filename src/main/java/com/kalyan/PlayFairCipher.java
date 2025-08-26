package com.kalyan;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class PlayFairCipher {
    static char[][] matrix = new char[5][5];
    public static void main(String[] args) {
        Set<Character> set = new LinkedHashSet<>();
        "KALYAN".toUpperCase().replace("Y", "N").chars().forEach(c -> set.add((char)c));
        for (char c = 'A'; c <= 'Z'; c++) if (c != 'J') set.add(c);
        Iterator<Character> it = set.iterator();
        for (int i = 0; i < 25; i++) matrix[i/5][i%5] = it.next();
        Arrays.stream(matrix).forEach(r -> System.out.println(Arrays.toString(r)));
    }
}
