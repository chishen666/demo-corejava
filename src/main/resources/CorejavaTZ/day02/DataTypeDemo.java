package com.corejava.day02;

/**
 * ����������ʾJava������������
 *
 * ����:JSD1412
 * ʱ��:2015-1-4 ����3:57:47
 */
public class DataTypeDemo {
	public static void main(String[] args) {
		
		byte b = 127;
		short s = 32767;
		int i = 2147483647;
		long l = 100;
		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);

		//����дһ��С��,Ĭ����double����
		//float f = 3.14;�������
		double d = 3.14;

		boolean bool = false;
		System.out.println(bool);

		char c1 = 'A';//65
		char c2 = 'a';//97
		char c3 = '0';//48
		char c4 = '\u597d';//unicode����,ʮ����������
		char c5 = '\n';//�������
		char c6 = '\t';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5 + "Test");
		System.out.println(c6 + "Test");

		//A��Z�е�����ַ�,65~90
		System.out.println((char) ((int) (Math.random() * 26 + 65)));
		
		//����:
		char cc1 = '3';
		char cc2 = '5';
		int i1 = cc1 - '0';//����ת���ַ��ɶ�Ӧ����
		int i2 = cc2 - '0';
		System.out.println(i1 + i2);
	}
}
