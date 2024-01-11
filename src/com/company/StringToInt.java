package com.company;

import java.util.ArrayList;
import java.util.List;

public class StringToInt {
    private static final int INT_MAX = Integer.MAX_VALUE;
    private static final int INT_MIN = Integer.MIN_VALUE;
    private static final int MAX_LENGTH = String.valueOf(Integer.MAX_VALUE).length();
    private static boolean isMinus = false;

    public static int myAtoi(String s) {
        StringBuilder temp = new StringBuilder();
        boolean numberSeqStarted = false;
        char[] chars = s.toCharArray();
        boolean isSign = false;
        for(int i = 0; i < chars.length; i++) {
            if (!numberSeqStarted && !Character.isDigit(chars[i]) && !Character.isSpaceChar(chars[i]) && chars[i] != '-' && chars[i] != '+') {
                return 0;
            }
            if(Character.isDigit(chars[i])) {
                if(i !=0 && chars[i-1] == '-') {
                    isMinus = true;
                    temp.append(chars[i-1]);
                }
                if(chars[i] == '0' && (temp.length() == 0 || temp.charAt(0) == '-')) {
                    continue;
                }
                if (!numberSeqStarted) {
                    numberSeqStarted = true;
                }
                temp.append(chars[i]);
            } else {
                if (chars[i] == '-' || chars[i] == '+') {
                    if (isSign) {
                        return 0;
                    }
                    isSign = true;
                }
                if(numberSeqStarted && (Character.isSpaceChar(chars[i]) || chars[i] == '.')) {
                    // return 0;
                    break;
                } else if (numberSeqStarted && !Character.isSpaceChar(chars[i])){
                    return 0;
                }
            }
        }
        return validateAndSet(temp);
    }

    private static int validateAndSet(StringBuilder temp) {
        int result = 0;
        if (temp.length() < MAX_LENGTH) {
            result = temp.length() != 0 ? Integer.parseInt(temp.toString()) : 0;
        } else if(temp.length() == MAX_LENGTH) {
            if (isMinus) {
                result = Integer.parseInt(temp.toString());
            } else {
                int safeInt = Integer.parseInt(temp.substring(0, temp.length() - 1));
                if(safeInt >  INT_MAX/10 || (safeInt == Integer.MAX_VALUE / 10
                        && (int) temp.charAt(temp.length()) > 7)) {
                    result = isMinus ? INT_MIN : INT_MAX;
                } else {
                    result = Integer.parseInt(temp.toString());
                }
            }

        } else {
            result = isMinus ? INT_MIN : INT_MAX;
        }
        return result;
    }

    public static void main(String[] args) {
//        String input = "words and 987";
//        String input = "42";
//        String input = "   -42";
//        String input = "-000000000000001";
//        String input = "+-12";
//        String input = "";
//        String input = "  0000000000012345678";
        String input = "00000-42a1234";
        System.out.println(myAtoi(input));
    }
}
