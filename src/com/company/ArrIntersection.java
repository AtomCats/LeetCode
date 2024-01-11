package com.company;

import java.util.HashMap;

public class ArrIntersection {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length < nums2.length) {
            return intersect(nums2, nums1);
        }
        HashMap<Integer, Integer> numbersWithCounter = new HashMap<>();
        int k = 0;

        for(int n : nums1) {
            numbersWithCounter.put(n, numbersWithCounter.getOrDefault(n, 0) + 1);
        }

        for(int n: nums2) {
            if(numbersWithCounter.getOrDefault(n, 0) > 0) {
                nums1[k++] = n;
                numbersWithCounter.put(n, numbersWithCounter.get(n) - 1);
            }
        }
        int[] result = new int[k];

        for(int i = 0; i < k; i ++) {
            result[i] = nums1[i];
        }
        return result;
    }

}
