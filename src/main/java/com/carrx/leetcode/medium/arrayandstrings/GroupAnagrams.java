package com.carrx.leetcode.medium.arrayandstrings;

import java.util.*;

/**
 * Given an array of strings, group anagrams together.
 * <p>
 * Example:
 * <p>
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 * ["ate","eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 * ]
 * Note:
 * <p>
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 *
 * @Author: Carl.Xiang
 * @Date: 2020/1/13 15:09
 **/
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        if (strs != null && strs.length > 0) {
            Map<String, List<String>> map = new HashMap<>(16);
            for (int i = 0; i < strs.length; i++) {
                char[] chars = strs[i].toCharArray();
                Arrays.sort(chars);
                String aa = new String(chars);
                if (!map.keySet().contains(aa)) {
                    List<String> list = new ArrayList();
                    map.put(aa, list);
                }
                map.get(aa).add(strs[i]);
            }

            for (List<String> value : map.values()) {
                ans.add(value);
            }

        }
        return ans;
    }
}
