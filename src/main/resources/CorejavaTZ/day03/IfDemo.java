package com.corejava.day03;

/**
 * ����������ʾJava�����ж�
 *
 * ����:JSD1412
 * ʱ��:2015-1-6 ����1:37:31
 */
public class IfDemo {
	
	public static void main(String[] args) {
		int score = 78;
		if (score < 0 || score > 100) {

			System.out.println("�������Ϸ�!");
		} else {
			if (score < 60) {
				System.out.println("������");
			} else if (score < 80) {
				System.out.println("����");
			} else if (score < 90) {
				System.out.println("����");
			} else {
				System.out.println("����");
			}
		}
	}
}
