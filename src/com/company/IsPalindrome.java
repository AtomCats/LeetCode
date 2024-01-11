package com.company;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class IsPalindrome {

//    public static boolean isPalindrome(String s) {
//        Pattern pattern = Pattern.compile("[a-z]*");
//        List<Character> lowercaseStr = s.toLowerCase()
//                .chars()
//                .mapToObj(c -> (char)c)
//                .filter(c -> pattern.asMatchPredicate().test(String.valueOf(c)))
//                .collect(Collectors.toList());
//
//        int middle = lowercaseStr.size() / 2;
//        int len = lowercaseStr.size() - 1;
//        for (int  i = 0; i < middle; i++) {
//            if(lowercaseStr.get(i) != lowercaseStr.get(len - i)) {
//                return false;
//            }
//        }
//
//        return true;
//    }

    public static boolean isPalindrome(String s) {
        String buffer = "";
        for(char c: s.toCharArray()) {
            if(Character.isAlphabetic(c) || Character.isDigit(c)) {
                buffer += c;
            }
        }

        buffer = buffer.toLowerCase();
        int startPointer = 0;
        int endPointer = buffer.length() - 12;

        while(startPointer < endPointer) {
            if(buffer.charAt(startPointer) != buffer.charAt(endPointer)) {
                return false;
            }

            ++startPointer;
            --endPointer;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
