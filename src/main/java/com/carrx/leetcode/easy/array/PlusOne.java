package com.carrx.leetcode.easy.array;

import java.util.Arrays;

/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 * <p>
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Example 2:
 * <p>
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 *
 * @Author: Carl.Xiang
 * @Date: 2020/1/7 19:29
 **/
public class PlusOne {
    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        System.out.println(Arrays.toString(plusOne(digits1)));
    }


    /**
     * 最优解法
     *
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[len + 1];
        result[0] = 1;
        return result;
    }
}
