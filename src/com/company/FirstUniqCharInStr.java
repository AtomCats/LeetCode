package com.company;

import java.util.HashMap;

public class FirstUniqCharInStr {
    public static int firstUniqChar(String s) {
        int result = -1;
        int length = s.length();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < length; i++) {
            map.compute(s.charAt(i), (k,v) -> v == null ? 1 : ++v);
        }

        for(int i = 0; i < length; i++) {
            if(map.get(s.charAt(i)) == 1) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
}
