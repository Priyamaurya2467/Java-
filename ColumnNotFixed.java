package com.maurya;

import java.util.Arrays;

public class ColumnNotFixed {
    public static void main(String[] args) {
        int[][] arr = {
                { 4,8,6},
                { 5,7,9},
                { 5, 9,8}
        };
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
    }
    }
}
