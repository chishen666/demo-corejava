package com.carrx.leetcode.easy.strings;

/**
 * @Author: Carl.Xiang
 * @Date: 2020/1/20 17:08
 **/
public class StringtoInteger {
    public static void main(String[] args) {
        String s = "-+ 1";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String str) {
        if (str == null) {
            return 0;
        }
        str = str.trim();
        if (str == "" || str == "-") {
            return 0;
        }
        boolean fushu = false;
        String ans = "";
        int result = 0;
        if (str.charAt(0) == '-') {
            fushu = true;
            str = str.substring(1);
            ans = "-";
        }
        if (str.charAt((0)) < '0' || str.charAt(0) > '9') {
            return 0;
        } else {
            int index = 0;
            while (index < str.length() && str.charAt((index)) >= '0' && str.charAt(index) <= '9') {
                ans += str.charAt(index++);
            }
        }
        try {
            result = Integer.parseInt(ans);
        } catch (NumberFormatException e) {
            if (fushu) {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }
        return result;
    }
}
