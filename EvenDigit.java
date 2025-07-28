package com.maurya;

import java.util.EnumSet;

public class EvenDigit {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7892};

        int ans = searchs(arr);
        System.out.println(ans);

    }

    static int searchs(int[] nums) {
        int count = 0;

        for (int num = 0; num < nums.length; num++) {
            int n =  nums[num];
            if (even(n)){
                count++;
            }

        }

        return count; 
    }
        static  boolean even (  int num){
            int numberOfDigits = digits(num);
            return numberOfDigits % 2 == 0;
        }
        //count number of digits
        static int digits ( int num){
            if (num < 0) {
                num = num * -1;
            }
            if (num == 0) {
                return 1;
            }
            int count = 0;
            while(num > 0){
                count++;
                num /= 10;

        }
            return count;
    }
}
