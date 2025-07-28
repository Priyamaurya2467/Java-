package com.maurya;

import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
                1  2  3
                4  5  6
                7  8  9
        */
        //  int[][] arr = new int[3][];
//        int [] [] arr = {
//                { 5 , 9 , 6},
//                { 2 , 3 , 8},
//                { 6 , 0 , 7}
//        };
//
        int[][] arr = new int[3][4];
        // input
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //output
//        for ( int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

         // enhanced for loop
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        }
    }
