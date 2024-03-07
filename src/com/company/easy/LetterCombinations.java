package com.company.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LetterCombinations {
    final static String[] PHONE_MAP = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "whyz"};

    public static List<String> letterCombinations(String digits) {

        if(digits.isEmpty())
            return Collections.emptyList();

        List<String> output = new ArrayList<>();
        explore("", digits, output);
        return output;
    }

    private static void explore(String combination, String nextDigits, List<String> output) {
        if(nextDigits.isEmpty()) {
            output.add(combination);
        } else {
            final String letters = PHONE_MAP[nextDigits.charAt(0) - '2'];
            for (char letter: letters.toCharArray()) {
                explore(combination + letter, nextDigits.substring(1), output);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("234"));
    }
}
