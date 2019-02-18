package com.corejava.day11;

import java.util.LinkedList;

import com.corejava.util.InputUtil;

/**
 * ����������ʾ���ü���ģ���ջƥ������
 *
 * ����:JSD1412
 * ʱ��:2015-1-20 ����1:39:29
 */
public class Exercise1 {
	public static void main(String[] args) {
		//����һ��LinkedList����ģ���ջ
		LinkedList<Character> characters = new LinkedList<>();
		String message = InputUtil.inputLine("������������:");
		//���ַ���ת�����ַ�����
		char[] charArr = message.toCharArray();
		//���ַ������һ��Ԫ�ط��뵽������
		characters.add(charArr[0]);
		for (int i = 1; i < charArr.length; i++) {
			char firstElement = ' ';
			//ȡ���ϵ�һ��Ԫ��
			if (characters.size() == 0) {
				characters.push(charArr[i]);
				continue;
			} else {
				firstElement = characters.peek();
			}
			if ((charArr[i] == ')' && firstElement == '(')
					|| (charArr[i] == ']' && firstElement == '[')
					|| (charArr[i] == '}' && firstElement == '{')) {
				//�Ѽ����е�һ��Ԫ��ɾ��
				characters.poll();
			} else {
				//�Ѹ�Ԫ�ؼ��뵽���ϵ�һ��λ�ô�
				characters.push(charArr[i]);
			}
		}
		//�ж�
		if (characters.isEmpty()) {
			System.out.println("ƥ��ɹ�!");
		} else {
			System.out.println("ƥ��ʧ��!");
		}
	}
}
