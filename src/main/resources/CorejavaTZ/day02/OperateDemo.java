package com.corejava.day02;

/**
 * ����������ʾJava�����
 *
 * ����:JSD1412
 * ʱ��:2015-1-5 ����11:17:11
 */
public class OperateDemo {

	public static void main(String[] args) {
		
		byte b = 127;
		//b = b + 1;��������,�������
		
		b += 1;//�������Ͱ�ȫ����
		
		System.out.println(b);//������ǲ���ȷ
		
		//&	��λ��
		System.out.println(7 & 2);

		//|	��λ��
		System.out.println(7 | 2);

		//^	��λ���
		System.out.println(7 ^ 2);

		//~	��λȡ��
		System.out.println(~6);
	}
}
