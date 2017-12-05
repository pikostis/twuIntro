package com.company.prime;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);

        System.out.print(primeFactors.toString());
    }

    private static List<Integer> generate(int n) {
        List<Integer> primeFactors = new ArrayList<>();

        for (int i = 2; i < n; i++) {
            if ((n % i == 0) && isPrime(i)) primeFactors.add(i);
        }

        return primeFactors;
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

}
