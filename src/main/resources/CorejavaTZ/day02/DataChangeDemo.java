package com.corejava.day02;

/**
 * 
 * ����������ʾJava�������͵�ת��
 *
 * ����:JSD1412
 * ʱ��:2015-1-5 ����9:37:57
 */
public class DataChangeDemo {
	public static void main(String[] args) {
		//1.�Զ�����ת��(��ʽ����ת��)
		double d = 3;
		System.out.println(d);

		//2.ǿ������ת��
		float f = (float) 3.14;//û����ʧ����
		System.out.println(f);

		int i = (int) 3.94;
		System.out.println(i);//��ʧ����

		//����ǿ������ת������
		double d1 = 3D;
		double d2 = 3d;

		float f1 = 3.14F;
		float f2 = 3.14f;

		long l1 = 100L;
		long l2 = 100l;

		//Java�������������ͽ�������,�����ƫ���������ͽϴ��һ��!

		System.out.println(9 / 2);
		System.out.println(9.0 / 2);
		System.out.println(9 / 2.0);
		System.out.println(9.0 / 2.0);

		//�ַ�����ĳЩ�������ͽ�������,�����String
		System.out.println(3 + 3);
		System.out.println(3 + "3");
		System.out.println("3" + 3);
		System.out.println("3" + "3");
	}
}
