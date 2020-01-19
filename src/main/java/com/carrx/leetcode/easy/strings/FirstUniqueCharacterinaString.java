package com.carrx.leetcode.easy.strings;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * <p>
 * Examples:
 * <p>
 * s = "leetcode"
 * return 0.
 * <p>
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 *
 * @Author: Carl.Xiang
 * @Date: 2020/1/19 15:05
 **/
public class FirstUniqueCharacterinaString {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(s.indexOf('o'));
        System.out.println(s.indexOf('o', 1000));
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        int minIndex = -1;
        for (int c = 'a'; c <= 'z'; c++) {
            if (s.indexOf(c) != -1 && s.indexOf(c, s.indexOf(c) + 1) == -1) {
                if (minIndex == -1) {
                    minIndex = s.indexOf(c);
                } else {
                    minIndex = Math.min(minIndex, s.indexOf(c));
                }
            }
        }
        return minIndex;
    }
}
