package com.carrx.leetcode.easy.strings;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 123
 * Output: 321
 * Example 2:
 * <p>
 * Input: -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: 120
 * Output: 21
 *
 * @Author: Carl.Xiang
 * @Date: 2020/1/19 14:39
 **/
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        long ans = 0;
        while (x != 0) {
            ans = ans * 10 + x % 10;
            if (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) {
                return 0;
            }
            x /= 10;
        }
        return (int) ans;
    }
}
