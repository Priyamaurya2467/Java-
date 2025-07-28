package com.maurya;
public class PrimeNumbers {
    public static void main(String[] args) {
        int number = 40;
        for (int i = 2; i <= number; i++) {
            System.out.println(i + " " + isPrime(i));
        }
    }

        static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= number) {
            if (number % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
//    static boolean isPrime(int number) {
//        for (int i = 2; i < number; i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}