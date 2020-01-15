package com.carrx.leetcode.easy.array;

import java.util.Arrays;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * @Author: Carl.Xiang
 * @Date: 2020/1/6 14:29
 **/
public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                ++len;
                nums[len] = nums[i + 1];
            }
        }
        return ++len;
    }
}
