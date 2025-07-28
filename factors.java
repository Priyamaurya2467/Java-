package com.maurya;

public class factors {
    public static void main(String[] args) {
        int n = 3;
        isfactor(n);
        isfactor1(n);

    }

    //O(N)
    static void isfactor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    //0(sqrt(N))
    static void isfactor1(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {}
    }
}
