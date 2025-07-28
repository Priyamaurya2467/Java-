package com.maurya;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5 , 56, 87 , 32 , 87};
        reverse(arr);

    }

    static void reverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {


            System.out.print(arr[i] + " ");
        }
    }
}
