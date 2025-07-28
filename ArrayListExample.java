package com.maurya;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.add(9);
//        list.add(10);
//        list.add(11);
//
//        System.out.println(list.contains(5));
//        System.out.println(list.set(2,85));
//        System.out.println(list.remove(5));


        //input
        for(int i=0;i<10;i++){
            list.add(in.nextInt());
        }

        //to get item at any ndex
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println(list);


    }
}
