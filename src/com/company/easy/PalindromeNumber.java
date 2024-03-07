package com.company.easy;

import java.util.ArrayDeque;

public class PalindromeNumber {
    //121
    public static boolean isPalindrome(int x) {
        int reversedInt = 0;
        int k = x;
        if(x < 0) {
            return false;
        }
        while(k > 0) {
            reversedInt = reversedInt * 10 + (k % 10);
            k = k / 10;
        }
        if(reversedInt == x) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
