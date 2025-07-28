package com.maurya;

public class search {
    public static void main(String[] args) {
        int[] arr = {18, 12 , -7 , 3 , 14 , 28};
        int a =354;
        System.out.println(linearSearch(arr, a));

    }
    static int linearSearch(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        for (int i = 1; i < 4; i++) {
            if (nums[i] == target) {
                return i;
            }

        }
        return -1;
    }
}
