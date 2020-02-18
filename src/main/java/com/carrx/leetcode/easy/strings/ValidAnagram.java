package com.carrx.leetcode.easy.strings;

import java.util.Arrays;

/**
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "rat", t = "car"
 * Output: false
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * <p>
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 *
 * @Author: Carl.Xiang
 * @Date: 2020/1/19 17:44
 **/
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();

        Arrays.sort(ss);
        Arrays.sort(ts);
        return Arrays.equals(ss, ts);
    }
}
