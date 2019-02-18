package com.carrx.leetcode.easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysII {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		System.out.println(Arrays.toString(intersect1(nums1, nums2)));
	}

	public static int[] intersect1(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
		int count = 0;
		for (int i = 0; i < nums1.length; i++) {
			if (i > 0 && nums1[i] == nums1[i - 1]) {
				maps.put(nums1[i], ++count);
			} else {
				count = 1;
				maps.put(nums1[i], 1);
			}

		}
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums2.length; i++) {
			if (maps.containsKey(nums2[i])) {
				list.add(nums2[i]);
				if (maps.get(nums2[i]) == 1) {
					maps.remove(nums2[i]);
				} else {
					maps.put(nums2[i], maps.get(nums2[i]) - 1);
				}
			}
		}
		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}
}
