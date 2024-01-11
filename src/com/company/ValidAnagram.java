package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        int[] char_counts = new int[26];

        if(s.length() != t.length()) {
            return false;
        }
            for(int i =0; i < s.length(); i++) {
                char_counts[s.charAt(i) - 'a']++;
                char_counts[t.charAt(i) - 'a']--;
            }

            for(int count : char_counts) {
                if(count != 0) {
                    return false;
                }
            }
            return true;
    }

    public static void main(String[] args) {
        String s = "aacc";
        String t = "ccac";
        System.out.println(isAnagram(s,t));
    }
}
