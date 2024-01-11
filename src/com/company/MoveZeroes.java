package com.company;

import java.util.Arrays;

public class MoveZeroes {

    private static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int k = i + 1; k < nums.length; k++) {
                    if (nums[k] != 0) {
                        nums[i] = nums[k];
                        nums[k] = 0;
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        System.out.println("Before moving \n");
        Arrays.stream(nums).forEach(e -> System.out.print(e + " "));
        moveZeroes(nums);
        System.out.println("\nAfter rotate");
        Arrays.stream(nums).forEach(e -> System.out.print(e + " "));

    }
}
