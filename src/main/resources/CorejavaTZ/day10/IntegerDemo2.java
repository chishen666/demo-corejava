package com.corejava.day10;

/**
 * ����������ʾJava��װ����Զ������
 *
 * ����:JSD1412
 * ʱ��:2015-1-16 ����2:51:23
 */
public class IntegerDemo2 {
	public static void main(String[] args) {

		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		System.out.println(i1 == i2);//false
		System.out.println(i1.equals(i2));//true

		Integer i3 = 10;
		Integer i4 = 10;
		System.out.println(i3 == i4);//true
		System.out.println(i3.equals(i4));//true

		Integer i5 = 128;
		Integer i6 = 128;
		System.out.println(i5 == i6);//false
		System.out.println(i5.equals(i6));//true

		//ע��:�Զ�����ײ���ʵ���õ���valueOf()����
		Integer i7 = Integer.valueOf(10);
		Integer i8 = Integer.valueOf(10);

		//����:-128��127û�д����¶���,�Ǵӻ������ȡֵ,��������Χ�򴴽��¶���
	}
}
