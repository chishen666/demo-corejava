package com.corejava.day11;

import java.util.Scanner;
import java.util.Stack;

/**
 * @描述	 使用栈实现字符串的括号匹配检查   
 * @作者	 孙毅
 * @日期 2013-8-21 下午12:19:38
 */
public class 堆栈实现括号匹配2 {
	public static void matching(String s) {
		Stack<Character> stack = new Stack<Character>();
		char[] arr = s.toCharArray();
		for (Character c : arr) {
			if (c.equals('(') || c.equals(')') || c.equals('[')
					|| c.equals(']') || c.equals('{') || c.equals('}')) {
				if ((c.equals(')') && stack.peek().equals('('))
						|| (c.equals(']') && stack.peek().equals('['))
						|| (c.equals('}') && stack.peek().equals('{'))) {
					stack.pop();
				} else {
					stack.push(c);
				}
			}
		}
		
		if (stack.empty()) {
			System.out.println("括号匹配");
			return;
		}
		System.out.println("括号不匹配!");
	}

	public static void main(String[] args) {
		String s = "{()}";
		matching(s);
	}
}
