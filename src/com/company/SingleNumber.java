package com.company;

import java.util.HashSet;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int temp = 0;
        for(int x : nums) {
            if(!set.add(x)) {
                set.remove(x);
            }
        }
        return set.stream().findFirst().get();
    }
}
