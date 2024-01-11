package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class YaContestTest2 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new FileReader("input.txt"));

        int size = Integer.valueOf(r.readLine());
        int[] sequence = new int[size + 1];
        for (int i = 1; i <= size; i++) {
            sequence[i] = Integer.valueOf(r.readLine());
        }

        System.out.println(longestSequence(sequence));
    }

    public static int longestSequence(int[] vector)
    {
        int maxLength = 0;
        int currentLength = 0;

        for (int i = 0; i <= vector.length - 1; i++)
        {
            if (vector[i] == 1)
            {
                currentLength++;
                maxLength = (currentLength > maxLength) ? currentLength : maxLength;
            }
            else
            {

                currentLength = 0;
            }
        }

        return maxLength;
    }

//    public static void main(String[] args) throws Exception {
//        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
//
//        int size = Integer.parseInt(r.readLine());
//        int[] arr = new int[size];
//        int result = 0;
//        int maxResult = 0;
//        for(int i = 0; i < size; i++) {
//            arr[i] = Integer.parseInt(r.readLine());
//            if( arr[i] == 1) {
//                ++result;
//            }else {
//                maxResult = Math.max(result, maxResult);
//                result = 0;
//            }
//        }
//
//        System.out.println(result);
//    }
}
