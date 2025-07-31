package com.kalyan;

public class CeaserCipher {
    public static String encrypt(String text, int shift){
        StringBuilder encrypted = new StringBuilder();
        for(char c : text.toCharArray()){
            if(Character.isLetter(c)){
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                encrypted.append((char)(c - base + shift) %26 + base);
            }else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }
    public static void main(String[] args) {
        System.out.println("The encrypted form: "+
                encrypt("Kalyan", 1));
    }
}
