package com.maurya;

public class BitwiseOdd {
    public static void main(String[] args) {
        int n = 763;
        System.out.println(isOdd(n));
    }

    //Q1. Given  a number n find if it is even or odd number
    private static boolean isOdd(int n) {
        return (n & 1) == 1;     //for Odd
    }
}


