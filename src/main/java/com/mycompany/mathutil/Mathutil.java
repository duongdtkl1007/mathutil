package com.mycompany.mathutil;

public class Mathutil {
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument: n must be between 0 and 20.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("0! = " + getFactorial(0));
        System.out.println("5! = " + getFactorial(5));
    }
}