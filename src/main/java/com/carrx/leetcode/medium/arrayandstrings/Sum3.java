package com.carrx.leetcode.medium.arrayandstrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Note:
 * <p>
 * The solution set must not contain duplicate triplets.
 *
 * @Author: Carl.Xiang
 * @Date: 2020/1/10 17:28
 **/
public class Sum3 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int low = i + 1;
                int hight = nums.length - 1;
                int temp = -nums[i];
                while (low < hight) {
                    if (nums[low] + nums[hight] == temp) {
                        ans.add(Arrays.asList(nums[i], nums[low], nums[hight]));
                        while (low < hight && nums[low] == nums[low + 1]) {
                            low++;
                        }
                        while ((low < hight) && nums[hight] == nums[hight - 1]) {
                            hight--;
                        }
                        low++;
                        hight--;
                    } else if (nums[low] + nums[hight] < temp) {
                        low++;
                    } else {
                        hight--;
                    }
                }
            }
        }
        return ans;
    }
}
