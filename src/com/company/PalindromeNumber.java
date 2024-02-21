package com.company;

import java.util.Stack;
import java.util.Vector;

public class PalindromeNumber {
    //121
    public boolean isPalindrome(int x) {
        final Vector<Integer> vector = new Vector<>();
        int temp = x;
        while(x/10 > 0) {
            vector.add(x % 10);
            x = x / 10;
        }
    }
}
