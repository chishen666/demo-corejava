package com.corejava.day03;

import java.util.Scanner;

/**
 * ����������ʾSwitch case
 *
 * ����:JSD1412
 * ʱ��:2015-1-6 ����2:10:33
 */
public class SwitchCaseDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������:");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("����1");
			break;//��ϵ�ǰswitch
		case 2:
			System.out.println("����2");
			break;
		case 3:
			System.out.println("����3");
			break;
		case 4:
			System.out.println("����4");
			break;
		default:
			System.out.println("���޹���...");
		}
	}
}
