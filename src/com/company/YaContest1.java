package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class YaContest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ratings = new int[n];

        for (int i = 0; i < n; i++) {
            ratings[i] = scanner.nextInt();
        }

        long[] bonuses = new long[n];
        Arrays.fill(bonuses, 500);

        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                bonuses[i] = bonuses[i - 1] + 500;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1] && bonuses[i] <= bonuses[i + 1]) {
                bonuses[i] = bonuses[i + 1] + 500;
            }
        }

        long totalBonuses = 0;
        for (long bonus : bonuses) {
            totalBonuses += bonus;
        }
        System.out.println(totalBonuses);
    }
}

