package com.maurya;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;
        int q =1;
        int count = 2;
       while ( count <= n){
           int temp = q;

           q = q + p;
           p = temp;
           count++;
       }
        System.out.println(q);
    }
}
