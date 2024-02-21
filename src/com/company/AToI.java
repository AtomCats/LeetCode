package com.company;

import java.util.*;

public class AToI {
    private static final int INT_MAX = Integer.MAX_VALUE;
    private static final int INT_MIN = Integer.MIN_VALUE;

//    public static int myAtoi(String s) {
//        List<Character> deque = new ArrayList<>();
//        boolean isMinus = false;
//
//        for (Character ch: s.toCharArray()) {
//            if ((Character.isLetter(ch) || Character.getType(ch) == 24) && deque.isEmpty()) {
//                return 0;
//            } else if (!Character.isLetterOrDigit(ch) && !deque.isEmpty()) {
//                return convertStr(deque, isMinus);
//            } else {
//                if(ch.equals('-') && deque.isEmpty()){
//                    isMinus = true;
//                }
//                if(Character.isDigit(ch)) {
//                    deque.add(ch);
//                }
//            }
//        }
//        return convertStr(deque, isMinus);
//    }
//
//    private static int convertStr(List<Character> deque, boolean isMinus) {
//        int result = 0;
//        if (!deque.isEmpty()) {
//            for (Character ch:
//                 deque) {
//                final int num = isMinus ? -(ch - '0') : ch - '0';
//                if(result == 0 && num == 0) continue;
//                else if((result * 10) + num > INT_MAX/10) return  INT_MAX;
//                else if((result * 10) + num < INT_MIN/10) return INT_MIN;
//                else result = (result * 10) + num;
//            }
//        }
//
//        return result;
//    }

    public static int myAtoi(String s) {
        int result=0;    // helper variables
        int i=0;
        int sign=1;

        while(i<s.length()&&s.charAt(i)==' ')i++;  //ignore leading white space
        if(i==s.length())return 0;
        if(s.charAt(i)=='-'||s.charAt(i)=='+')          //check if number positve or negative
        {
            sign=s.charAt(i)=='-'?-1:1;
            i++;
        }
        // now iterate across digits if any
        // should only be in range 0-9
        while(i<s.length()&&(s.charAt(i)>='0'&&s.charAt(i)<='9'))  //traverse string till nondigit not found or string ends
        {
            int digit=(s.charAt(i)-'0')*sign;
            if(sign==1 && (result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 && digit>Integer.MAX_VALUE%10))) return Integer.MAX_VALUE; //check for overflow
            if(sign==-1 &&(result<Integer.MIN_VALUE/10 || (result==Integer.MIN_VALUE/10 && digit<Integer.MIN_VALUE%10))) return Integer.MIN_VALUE; //check for underflow

            result=result*10+digit; // update result
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
//        String input = "words and 987";
//        String input = "4193 with words";
//        String input = "42123231313123131";
//        String input = "   -42";
//        String input = "-000000000000001";
        String input = "+-12";
//        String input = "";
//        String input = "  0000000000012345678";
//        String input = "00000-42a1234";
//        String input = "3.14159";
//        String input = ".1";
        System.out.println(myAtoi(input));
    }
}
