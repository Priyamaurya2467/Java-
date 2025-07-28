package com.maurya;

import static com.maurya.selectionSort.swap;

public class secont_largest {
    public static void main(String[] args) {
        int[] arr = {45,85,32,5,62};
        int ans = selection(arr);
        System.out.println(ans);
    }
    static int selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int start = 0;
            int end = arr.length - 1 - i;
            int maxIndex = getMax(arr, start, end);
            swap(arr, maxIndex, end);
        }
        return arr[arr.length - 2];
    }
        static int getMax(int[] arr ,int start , int end){
            int max = start;
            for (int i = 1; i <= end; i++) {
                if (arr[max] < arr[i]) {
                    max = i;
                }
            }
            return max;
        }
        static void swap(int[] arr,int maxIndex , int end){
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[end];
            arr[end] = temp;
        }
    }

