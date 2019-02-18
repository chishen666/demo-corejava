package com.carrx.leetcode.easy.array;

public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 9, 3, 15, 2, 1, 15 };
		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		int ans = 0;
		for (int i = 0; i < nums.length; i++)
			ans = ans ^ nums[i];
		return ans;
	}
}
