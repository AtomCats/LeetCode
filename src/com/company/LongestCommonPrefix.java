package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        List<Character> characterList = strs[0].chars().mapToObj(c -> (char) c).toList();
        boolean charMatched = false;
        int startPos = 0;
        int endPos = 0;

            for (int j = 0; j < characterList.size(); j++) {
                for (int i = 1; i < strs.length; i++) {
                    String str = strs[i];
                    if (str.length() <= j) {
                        charMatched = false;
                        break;
                    }
                    if (str.charAt(j) == characterList.get(j)) {
                        charMatched = true;
                    } else {
                        charMatched = false;
                        break;
                    }
                }
                if (charMatched) {
                    endPos = j + 1;
                } else break;
            }
            if (strs.length == 1) {
                return strs[0];
            }
        if(startPos > endPos || startPos == endPos) {
            return "";
        }
        return strs[0].substring(startPos, endPos);
    }

    public static void main(String[] args) {
//        String input = "words and 987";
//        String input = "4193 with words";
//        String input = "42123231313123131";
//        String input = "   -42";
//        String input = "-000000000000001";
//        String strs[] = new String[]{"cardog","car","carman"};
//        String strs[] = new String[]{"a"};
//        String strs[] = new String[]{"a","a","a"};
        String strs[] = new String[]{"cir","car"};
//        String strs[] = new String[]{"flower","flow","flight"};
//        String input = "";
//        String input = "  0000000000012345678";
//        String input = "00000-42a1234";
//        String input = "3.14159";
//        String input = ".1";
        System.out.println(longestCommonPrefix(strs));
    }
}
