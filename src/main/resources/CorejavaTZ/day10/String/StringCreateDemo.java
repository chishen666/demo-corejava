package com.corejava.day10.String;

/**
 * ����������ʾJava�ַ����Ĵ���
 *
 * ����:JSD1412
 * ʱ��:2015-1-19 ����9:22:43
 */
public class StringCreateDemo {
	public static void main(String[] args) {
		//�ַ����Ĵ�����ʽ
		//1.����ѿռ�
		String s1 = new String("abc");
		String s2 = new String("abc");

		s1 += "";

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		//2.���봮��
		String s3 = "abc";
		String s4 = "abc";

		//s3 += "";

		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
		//����һ���յ�Ĭ��16���ַ����ַ�������
		StringBuilder builder1 = new StringBuilder();
		
		//����һ���յ�ָ����ʼ���������ַ�������
		StringBuilder builder2 = new StringBuilder(10);
		
		//����ָ���ַ�������StringBuilder����
		StringBuilder builder3 = new StringBuilder("abc");
		StringBuilder builder4 = new StringBuilder("abc");
		System.out.println(builder3 == builder4);
		System.out.println(builder3.equals(builder4));//false,StringBuilder��û����дequals()����
	}
}
