package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Rotate {

    public void rotate(int[] nums, int k) {

        int[] newArr = new int[nums.length];
        System.arraycopy(nums, 0, newArr, 0, nums.length);
        while(k != 0) {
            newArr = shiftArray(newArr);
            k--;
        }
        System.arraycopy(newArr, 0, nums, 0, nums.length);
    }

    private int[] shiftArray(int[] nums) {
        int length = nums.length - 1;
        int[] newNums = new int[nums.length];
        int counter = 0;
        int temp = nums[length];
        while(length > 0) {
            newNums[length] = nums[length - 1];
            length --;
        }
        if (length == 0) {
            newNums[length] = temp;
        }
        return newNums;
    }

    public void shiftArray1(int[] nums, int k) {
        final LinkedList<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toCollection(LinkedList::new));
        while(k != 0) {
            list.offerFirst(list.pollLast());
            k--;
        }
        System.arraycopy(list.stream().mapToInt(Integer::intValue).toArray(), 0, nums, 0, nums.length);
    }

}
