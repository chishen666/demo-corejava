package com.corejava.day02;

/**
 * ����������ʾͨ��Java����������
 *
 * ����:JSD1412
 * ʱ��:2015-1-5 ����2:03:11
 */
public class BinaryDemo {
	
	public static void main(String[] args) {
		
		//���������ֵĶ�����
		System.out.println(Integer.toBinaryString(-7));
		
		//���������ֵİ˽���
		System.out.println(Integer.toOctalString(22));

		//���������ֵ�ʮ������
		System.out.println(Integer.toHexString(15));
		
		//��������Ƶ��ַ���ת����ʮ��������
		System.out.println(Integer.parseInt("111", 2));
	}
}
