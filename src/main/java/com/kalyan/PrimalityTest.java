package com.kalyan;

public class PrimalityTest {
    static boolean isPrime(int n) {
        return n > 1 && java.util
                .stream
                .IntStream
                .rangeClosed(2, (int)Math.sqrt(n)).noneMatch(i -> n % i == 0);
    }
    public static void main(String[] args) {
        System.out.println(isPrime(29));
    }
}

