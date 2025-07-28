package com.maurya;

public class BitwiseFindSingle {
    public static void main(String[] args) {


        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(FindUnique(arr));

    }

    static int FindUnique(int[] arr) {
        int unique = 0;
        for (int j : arr) {   // for every j in arr OR for every no. in an array
            unique = unique ^ j;
        }

        return unique;
    }
}
