package com.corejava.day01;

//2.����
import java.util.Scanner;

/**
 * ����������ʾJava��ȡ�û���������
 *
 * ����:JSD1412
 * ʱ��:2015-1-4 ����2:14:50
 */
public class ScannerDemo {
	public static void main(String[] args) {
		//1.����Scanner����
		Scanner sc = new Scanner(System.in);
		System.out.println("������������:");
		//3.��ȡ�û���������
		//��������,�ȴ��û�������

		//int r = sc.nextInt();
		//double r = sc.nextDouble();

		String r = sc.nextLine();//��ȡ�û������������Ϣ

		System.out.println("���ղ��������:" + r);
	}
}
