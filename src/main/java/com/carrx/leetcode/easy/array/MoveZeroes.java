package com.carrx.leetcode.easy.array;

import java.util.Arrays;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * Example:
 * <p>
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 * <p>
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 *
 * @Author: Carl.Xiang
 * @Date: 2020/1/7 19:48
 **/
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[len] = nums[i] ^ nums[len];
                nums[i] = nums[i] ^ nums[len];
                nums[len] = nums[i] ^ nums[len];
                len++;
            }
        }
    }
}
