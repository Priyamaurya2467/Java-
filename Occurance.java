package com.maurya;

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        int n = 1385757879;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number whose occurance to be checked");
        int a = sc.nextInt();
        int count = 0;
        while(n>0) {
            int rem = n % 10;
            if (rem == a) {
                count++;


            }
            n = n / 10;
        }
        System.out.println(count);

    }
}
