package com.corejava.day10.String;

import com.corejava.util.InputUtil;

/**
 * 本类用来演示查找功能
 *
 * 作者:JSD1412
 * 时间:2015-1-19 上午11:07:39
 */
public class Exercise1 {
	public static void main(String[] args) {

		String[] keywords = { "少年", "派", "奇幻", "漂流" };

		String message = InputUtil.inputLine("请您输入内容:");

		int count = 0;
		boolean isFind = false;

		for (int i = 0; i < keywords.length; i++) {
			String keyword = keywords[i];

			if (message.contains(keyword)) {
				count++;
				if (count == 2) {
					isFind = true;
				}
			}
		}
		if (isFind) {
			System.out.println("找到相关内容.");
		}
	}
}
