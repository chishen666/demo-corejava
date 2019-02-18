package com.corejava.util;

import java.util.Scanner;

/**���빤����*/
public class InputUtil {
	
	//ȫ�ֱ���,����
	private static Scanner sc = new Scanner(System.in);

	/**
	 * ��ȡ�û��������������
	 */
	public static int inputInt(String message) {
		System.out.println(message);
		return sc.nextInt();
	}

	/**
	 * ��ȡ�û����������С��
	 */
	public static double inputDouble(String message) {
		System.out.println(message);
		return sc.nextDouble();
	}

	/**
	 * ��ȡ�û�����������ַ���
	 */
	public static String inputLine(String message) {
		System.out.println(message);
		return sc.nextLine();
	}
}
