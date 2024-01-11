package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class YaContest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = Integer.parseInt(in.nextLine());
        int minRating = in.nextInt();
        int sum = 500;
        counter--;
        ArrayList<Integer> ratings = new ArrayList<>();
        while (counter > 0) {
            int temp = in.nextInt();
            if(temp < minRating) {
                ratings.add(minRating);
                minRating = temp;
            } else {
                ratings.add(temp);
            }
            counter--;
        }
        for (int n : ratings) {
            sum += n == 0 ? 500 : ((n - minRating)  * 500) + 500;
        }
        System.out.println(sum);
    }
}
