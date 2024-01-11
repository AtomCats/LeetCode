package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,2}; // Input array
        int[] expectedNums = {1,2}; // The expected answer with correct length
        int[] nums4 = {1,2,3}; // Input array
        int[] expectedNums4 = {1,2,3}; // The expected answer with correct length
        int[] nums1 = new int[]{1,1}; // Input array
        int[] expectedNums1 = new int[]{1}; // The expected answer with correct length
        int[]nums2 = new int[]{1,2,2}; // Input array
        int[]expectedNums2 = new int[]{1,2}; // The expected answer with correct length
        int[] nums3 = new int[]{0,0,1,1,1,2,2,3,3,4}; // Input array
        int[] expectedNums3 = new int[]{0,1,2,3,4}; // The expected answer with correct length

//        List.of(List.of(nums1, expectedNums1)).stream().forEach(list -> check(list.get(0), list.get(1)));
//        List.of(List.of(nums, expectedNums), List.of(nums1, expectedNums1), List.of(nums2, expectedNums2), List.of(nums3,expectedNums3), List.of(nums4,expectedNums4)).stream().forEach(list -> check(list.get(0), list.get(1)));


//        int[] prices = {1,2,3,4,5}; // Input array
//        int[] prices1 = {7,1,5,3,6,4}; // Input array
//        int[] prices2 = {6,1,3,2,4,7}; // Input array
//        int[] prices3 = {6,1,2,1,3,11}; // Input array
//        Buy_Sell bs = new Buy_Sell();
//        System.out.println(bs.maxProfit1(prices2));

//        int[] rotateArr = {1,2,3,4,5,6,7};
//        int k=3;
//        Rotate r = new Rotate();
//        System.out.println("Before rotate");
//        Arrays.stream(rotateArr).forEach(e -> System.out.print(e + " "));
//        r.shiftArray1(rotateArr, k);
//        System.out.println("\nAfter rotate");
//        Arrays.stream(rotateArr).forEach(e -> System.out.print(e + " "));

//        int[] intersectArr1 = {1,2,2,1};
//        int[] intersectArr2 = {2};
//        ArrIntersection arrIntersection = new ArrIntersection();
//        final int[] intersect = arrIntersection.intersect(intersectArr1, intersectArr2);
//        Arrays.stream(intersect).forEach(e -> System.out.print(e + " "));

//        int[] plusArr = {9};
////        int[] plusArr = {8,9,9,9};
////        int[] plusArr = {1,2,3};
////        int[] plusArr = {4,3,2,1};
//        PlusOne plusOne = new PlusOne();
//        final int[] ints = plusOne.plusOne(plusArr);
//        Arrays.stream(ints).forEach(e -> System.out.print(e + " "));

        Sudoku s = new Sudoku();
        char[][] board = {{'8','3','.','.','7','.','.','.','.'}, {'6','.','.','1','9','5','.','.','.'}, {'.','9','8','.','.','.','.','6','.'}, {'8','.','.','.','6','.','.','.','3'}, {'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
//        char[][] board = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(s.isValidSudoku(board));

    }

    private static void check(int[] nums, int[] expectedNums) {
        int k = Solution.removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        System.out.println("\n/-/-//-/-/-//-/-/-/-/");
        System.out.print("nums[] = ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nK=" + k );
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
            System.out.print(nums[i] + " ");
        }
    }

}
