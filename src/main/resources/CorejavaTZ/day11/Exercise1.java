package com.corejava.day11;

import java.util.LinkedList;

import com.corejava.util.InputUtil;

/**
 * 本类用来演示利用集合模拟堆栈匹配括号
 *
 * 作者:JSD1412
 * 时间:2015-1-20 下午1:39:29
 */
public class Exercise1 {
	public static void main(String[] args) {
		//创建一个LinkedList用来模拟堆栈
		LinkedList<Character> characters = new LinkedList<>();
		String message = InputUtil.inputLine("请您输入内容:");
		//把字符串转换成字符数组
		char[] charArr = message.toCharArray();
		//把字符数组第一个元素放入到集合中
		characters.add(charArr[0]);
		for (int i = 1; i < charArr.length; i++) {
			char firstElement = ' ';
			//取集合第一个元素
			if (characters.size() == 0) {
				characters.push(charArr[i]);
				continue;
			} else {
				firstElement = characters.peek();
			}
			if ((charArr[i] == ')' && firstElement == '(')
					|| (charArr[i] == ']' && firstElement == '[')
					|| (charArr[i] == '}' && firstElement == '{')) {
				//把集合中第一个元素删除
				characters.poll();
			} else {
				//把该元素加入到集合第一个位置处
				characters.push(charArr[i]);
			}
		}
		//判断
		if (characters.isEmpty()) {
			System.out.println("匹配成功!");
		} else {
			System.out.println("匹配失败!");
		}
	}
}
