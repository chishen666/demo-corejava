package com.carrx.leetcode.easy.strings;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * <p>
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 * <p>
 * Example 1:
 * <p>
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 * <p>
 * Input: "race a car"
 * Output: false
 *
 * @Author: Carl.Xiang
 * @Date: 2020/1/19 17:59
 **/
public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome("race a car"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        int low = 0;
        int high = s.length() - 1;
        while (low < high) {
            while (low < high) {
                if ((chars[low] >= '0' && chars[low] <= '9') || (chars[low] >= 'a' && chars[low] <= 'z')) {
                    break;
                } else {
                    low++;
                    continue;
                }
            }

            while (low < high) {
                if ((chars[high] >= '0' && chars[high] <= '9') || (chars[high] >= 'a' && chars[high] <= 'z')) {
                    break;
                } else {
                    high--;
                    continue;
                }
            }
            if (low == high) {
                return true;
            } else if (chars[low] == chars[high]) {
                low++;
                high--;
            } else {
                return low == high;
            }
        }
        return true;
    }
}
