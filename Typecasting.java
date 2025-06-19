package com.maurya;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//        float num = sc.nextFloat();
//        System.out.println("Your number is: " + num);



        //Type - Casting
        int num = (int)(6532.23f);
        System.out.println("Your number is: " + num);

        //Automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a);   //max value of byte is 256  //257 % 256 = 1
//        System.out.println("Your number is: " +b);
        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = (a*b)/c;
        System.out.println("Your number is: " + d);
    }
}
