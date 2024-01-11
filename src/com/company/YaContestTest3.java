package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class YaContestTest3 {

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(r.readLine());
        int prevInt = Integer.parseInt(r.readLine());
        System.out.println(prevInt);
        for(int i = 1; i < size; i++) {
            int temp = Integer.parseInt(r.readLine());
            if(prevInt != temp) {
                System.out.println("\n" + temp);
                prevInt = temp;
            }
        }
        r.close();
    }
}
