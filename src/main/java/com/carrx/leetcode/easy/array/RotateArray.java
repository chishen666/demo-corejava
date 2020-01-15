package com.carrx.leetcode.easy.array;

import java.util.Arrays;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * @Author: Carl.Xiang
 * @Date: 2020/1/6 15:35
 **/
public class RotateArray {
    public static void main(String[] args) {
        int[] index = {0, 1, 2, 3, 4, 5, 6};
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int[] numsa = {6, 7, 1, 2, 3, 4, 5};
        int k1 = 2;

        rotate4(nums1, k1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {-1, -100, 3, 992};
        int k2 = 2;
        rotate4(nums2, k2);
        System.out.println(Arrays.toString(nums2));
    }

    /**
     * 实现方式1
     * 时间复杂度O(n)：n * k
     * 空间复杂度O(n)：1
     *
     * @param nums
     * @param k
     */
    public static void rotate1(int[] nums, int k) {
        k = k % nums.length;
        for (int i = 0; i < k; i++) {
            int temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }

    /**
     * 实现方式2
     * 时间复杂度O(n)：2n
     * 空间复杂度O(n)：n
     *
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] temp = new int[len];
        for (int i = 0; i < len; i++) {
            temp[(i + k) % len] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            nums[i] = temp[i];
        }
    }

    /**
     * 实现方式4
     * 时间复杂度O(n)：n
     * 空间复杂度O(n)：k
     *
     * @param nums
     * @param k
     */
    public static void rotate4(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        int[] temp = new int[k];
        System.arraycopy(nums, len - k, temp, 0, k);
        System.arraycopy(nums, 0, nums, k, len - k);
        System.arraycopy(temp, 0, nums, 0, k);
    }
}
