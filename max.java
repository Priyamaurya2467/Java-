package com.maurya;

public class max {
    public static void main(String[] args) {
        int[] arr = {251,472,233,174,195};
        System.out.println(max(arr));
    }
    static int max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }

        }
        return max;
    }
    }

