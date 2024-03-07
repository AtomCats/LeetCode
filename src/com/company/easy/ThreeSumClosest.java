package com.company.easy;

import java.util.*;

public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {
        int length = nums.length - 1;
        int resultSum = nums[0] + nums[1] + nums[length];

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = length;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(target - sum) < Math.abs(target - resultSum)) {
                    resultSum = sum;
                }
                if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return resultSum;
    }

    public static void main(String[] args) {
        int[] nums = {4,0,5,-5,3,3,0,-4,-5};
        System.out.println(threeSumClosest(nums, -2));

    }
}
