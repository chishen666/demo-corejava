package com.corejava.day10.String;

import com.corejava.util.InputUtil;

/**
 * ����������ʾ���ҹ���
 *
 * ����:JSD1412
 * ʱ��:2015-1-19 ����11:07:39
 */
public class Exercise1 {
	public static void main(String[] args) {

		String[] keywords = { "����", "��", "���", "Ư��" };

		String message = InputUtil.inputLine("������������:");

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
			System.out.println("�ҵ��������.");
		}
	}
}
