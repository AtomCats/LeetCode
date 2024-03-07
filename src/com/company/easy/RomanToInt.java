package com.company.easy;

public class RomanToInt {

    public static int romanToInt(String s) {

        RomanInt prev = RomanInt.valueOf(s.charAt(s.length() - 1));
        int total = prev.asInt;
        for(int i = s.length() - 2; i >= 0; i--) {
            final RomanInt curr = RomanInt.valueOf(s.charAt(i));
            if (prev.asInt >  curr.asInt) {
                total = total - curr.asInt;
            } else {
                total = total + curr.asInt;
            }
            prev = curr;
        }
        return total;
    }

    enum RomanInt {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);

        final int asInt;

        RomanInt(int i) {
            this.asInt = i;
        }

        static RomanInt valueOf(char c) {
            return RomanInt.valueOf(String.valueOf(c));
        }
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}

