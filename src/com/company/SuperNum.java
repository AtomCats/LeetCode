package com.company;

import java.util.ArrayList;


public class SuperNum {

    public static void main(String[] args) {
        ArrayList<Integer> superNums = new ArrayList<>();

        for(int i = 2; i <= 263000; i++) {
            final int sumOfDeviders = getSumOfDeviders(i);
            if(getSumOfDeviders(sumOfDeviders) == i * 2) {
                superNums.add(i);
                System.out.println(i + "\n");
            }
        }
    }

    private static int getSumOfDeviders(int num) {
        int sum = 0;
        for(int j = 1; j <= num; j++) {
            if(num % j == 0) {
                sum += j;
            }
        }
        return sum;
    }
}
