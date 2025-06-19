package com.maurya;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take input from user until the user does not press X or x
        while (true) {
            System.out.println("Enter the opreator");
            char ch = sc.next().trim().charAt(0);
            int ans = 0;
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                //input two number
                System.out.println("Enter the number");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (ch == '+') {
                    ans = num1 + num2;
                }

                if (ch == '-') {
                    ans = num1 - num2;
                }

                if (ch == '*') {
                    ans = num1 * num2;
                }

                if (ch == '/') {
                    if (num2 == 0) {
                        System.out.println("undefined");
                    } else if (num1 == 0) {
                        System.out.println("zero");
                    } else {
                        num2 = num1 / num2;
                    }
                }

            }
            else if (ch == 'X' || ch == 'x') {
                break;
            }

            else {
                    System.out.println("invalid input");
            }


            System.out.println(ans);
        }
    }
}
