package com.company.easy;

public class SortedSquares {

    public int[] sortedSquares(int[] nums) {

        int length = nums.length - 1;
        int leftIndex = 0;
        int rightIndex = length;
        int index = length;
        final int[] result = new int[nums.length];

        while(leftIndex <= rightIndex) {
            if (Math.abs(nums[leftIndex]) > Math.abs(nums[rightIndex])) {
                result[index] = nums[leftIndex] * nums[leftIndex];
                leftIndex ++;
            } else {
                result[index] = nums[rightIndex] * nums[rightIndex];
                rightIndex--;
            }
            index--;
        }
        return result;
    }
}
