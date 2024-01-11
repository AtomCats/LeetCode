package com.company;

import java.util.regex.Pattern;

class Solution {
    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        int numbersAmount = 0;

            int lastReplacedIndex = 0;
            int nextInsertIndex = len - 1;

            for(int i = 0; i <= nextInsertIndex; i++) {

                for(int k = i+1; k <= nextInsertIndex; k++) {
                    if(nums[k] == nums[i]) {
                        moveValueToPosition(nums, k, nextInsertIndex);
                        lastReplacedIndex = nextInsertIndex;
                        nextInsertIndex--;
                        k--;
                    }
                }
            }
            numbersAmount = lastReplacedIndex;
            if(lastReplacedIndex == 0) {
                numbersAmount = len;
            }


//            int lastReplacedIndex = len - 1;
//            int nextInsertIndex = lastReplacedIndex;
//
//            for(int i = 0; i < lastReplacedIndex; i++) {
//
//                for(int k = i+1; k < lastReplacedIndex; k++) {
//                    if(nums[k] == nums[i]) {
//                        moveValueToPosition(nums, k, nextInsertIndex);
//                        lastReplacedIndex = nextInsertIndex;
//                        nextInsertIndex--;
//                        k--;
//                    }
//                }
//            }
//            numbersAmount = lastReplacedIndex;
//            if(lastReplacedIndex == nextInsertIndex) {
//                numbersAmount ++;
//            }


//        if (len > 1) {
//            int lastReplaced = len - 1;
//            int nextInsertIndex = lastReplaced;
//            for(int i = 0; i < lastReplaced; i++) {
//                if(nums[i] == nums[nextInsertIndex] && i == nextInsertIndex - 1) {
//                     return numbersAmount = i + 1;
//                } else {
//                    for(int k = i+1; k < lastReplaced; k++) {
//                        if(nums[k] == nums[i]) {
//                            moveValueToPosition(nums, k, nextInsertIndex);
//                            lastReplaced = nextInsertIndex;
//                            nextInsertIndex--;
//                            k--;
//                        }
//                    }
//                }
//            }
//            if(nextInsertIndex != len -1) {
//                numbersAmount = lastReplaced;
//            }  else {
//                if(len == 2 && nums[0] == nums[1]) {
//                    numbersAmount = 1;
//                } else {
//                    numbersAmount = len;
//                }
//            }
//        } else {
//            numbersAmount = len;
//        }
        return numbersAmount;
    }
    private static int moveValueToPosition(int[] nums, int position, int lastInsertedPos) {
        int movedValue = nums[position];
        for(int i = position; i < lastInsertedPos; i ++) {
            nums[i] = nums[i+1];
        }
        nums[lastInsertedPos] = movedValue;
        return position;
    }
}
