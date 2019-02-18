package com.carrx.leetcode.easy.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 15 };
		System.out.println(containsDuplicate(nums));
	}

	public static boolean containsDuplicate(int[] nums) {
		if (nums == null || nums.length == 0) {
			return false;
		}
		Set<Integer> sets = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!sets.add(nums[i])) {
				return true;
			}
		}

		return false;
	}
}
