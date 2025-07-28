package com.maurya;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 36;
        int ans = sqrt(n);
        System.out.println(ans);
    }
    static int sqrt(int n) {
        int start = 0;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                start = mid + 1;
            } else if (mid * mid > n) {
                end = mid - 1;
            }
        }

        return 0;
    }
    }