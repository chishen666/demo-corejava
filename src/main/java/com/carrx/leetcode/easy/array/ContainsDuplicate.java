package com.carrx.leetcode.easy.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, find if the array contains any duplicates.
 * <p>
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 *
 * @Author: Carl.Xiang
 * @Date: 2020/1/7 17:14
 **/
public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate3(nums));
    }

    /**
     * 方法1：双层遍历
     *
     * @param nums
     * @return
     */
    public static boolean containsDuplicate1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 方法2：通过Arrays.sort排序排重
     *
     * @param nums
     * @return
     */
    public static boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }


    /**
     * 方法3：使用Set排重机制
     *
     * @param nums
     * @return
     */
    public static boolean containsDuplicate3(int[] nums) {
        Set<Integer> sets = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!sets.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

}
