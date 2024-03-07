package com.company.easy;

import java.util.*;

public class Sum3 {

    public static List<List<Integer>> threeSum(int[] nums) {
        final List<List<Integer>> result = new ArrayList<>();
        final Set<List<Integer>> tempResult = new HashSet<>();
        int length = nums.length;

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0 ) {
                    tempResult.add(Arrays.asList(nums[i], nums[j],  nums[k]));
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return tempResult.stream().toList();
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));

    }
}
