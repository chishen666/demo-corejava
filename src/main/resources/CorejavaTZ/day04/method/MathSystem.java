package com.corejava.day04.method;

import java.util.Scanner;

public class MathSystem {

	/**
	 * ���񷽷�
	 */
	public void service() {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			printMenu();
			System.out.print("����ѡ��:");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("���������һ������:");
				int a = sc.nextInt();
				System.out.println("��������ڶ�������:");
				int b = sc.nextInt();
				int result = getMax(a, b);
				System.out.println(a + "��" + b + "�нϴ������:" + result);
			} else if (choice == 2) {

			} else if (choice == 3) {

			} else if (choice == 4) {

			} else if (choice == 5) {
				System.out.println("~ллʹ��~");
				break;
			} else {
				System.err.println("�Բ���,������������,����������!");
			}
		}
	}

	/**
	 * ��ӡ����������
	 */
	public void printMenu() {
		System.out.println("===��ӭʹ��===");
		System.out.println("1.��ϴ�ֵ");
		System.out.println("2.�������");
		System.out.println("3.��ƽ����");
		System.out.println("4.��ָ��ֵ");
		System.out.println("5.�˳�");
		System.out.println("==============");
	}

	/**
	 * ��ϴ�ֵ
	 * @param a		��һ���Ƚ���
	 * @param b		�ڶ����Ƚ���
	 * @return		�ϴ�ֵ
	 */
	public int getMax(int a, int b) {
		int result = Math.max(a, b);
		return result;
	}

	/**
	 * ��������ַ���
	 * @param num	��Ҫת����ʮ��������
	 * @return		�������ַ���
	 */
	public String getBinary(int num) {
		String binary = Integer.toBinaryString(num);
		return binary;
	}

	/**
	 * ��ƽ����
	 * @param num	������������
	 * @return		ƽ����
	 */
	public double getSqrt(int num) {
		double result = Math.sqrt(num);
		return result;
	}

	/**
	 * ��ָ��ֵ
	 * @param a ����
	 * @param b ָ��
	 * @return	 ָ��ֵ
	 */
	public double getPow(int a, int b) {
		double result = Math.pow(a, b);
		return result;
	}
}
