package com.maurya;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String s1 = "abc";
        char ch = 'b';
        System.out.println(linearSearch(s1, ch));
        System.out.println(Arrays.toString(s1.toCharArray()));

    }
    static boolean linearSearch(String s1, char ch) {
        if (s1.length() == 0){
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ch) {
                return true;
            }

        }
        return false;
    }
}
