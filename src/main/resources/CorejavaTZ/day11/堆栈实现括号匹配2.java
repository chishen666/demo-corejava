package com.corejava.day11;

import java.util.Scanner;
import java.util.Stack;

/**
 * @����	 ʹ��ջʵ���ַ���������ƥ����   
 * @����	 ����
 * @���� 2013-8-21 ����12:19:38
 */
public class ��ջʵ������ƥ��2 {
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
			System.out.println("����ƥ��");
			return;
		}
		System.out.println("���Ų�ƥ��!");
	}

	public static void main(String[] args) {
		String s = "{()}";
		matching(s);
	}
}
