package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        final Map<Integer, LinkedList<Integer>> numsMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i ++ ) {
            numsMap.computeIfAbsent(nums[i], k -> new LinkedList<>()).add(i);
        }

        for (int i = 0; i < nums.length; i++) {
            final Integer second = target - nums[i];
            final LinkedList<Integer> listOfSecond = numsMap.getOrDefault(second, new LinkedList<>());
            final Integer secondIndex = listOfSecond.isEmpty() ? null : listOfSecond.getLast();
            if(secondIndex != null && secondIndex != i) {
                result[0] = i;
                result[1] = secondIndex;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,5,11};
        int target = 10;

        final int[] res = twoSum(nums, target);
        Arrays.stream(res).forEach(e -> System.out.print(e + " "));

    }
}
