package com.corejava.day10;

/**
 * ����������ʾJava��װ��
 *
 * ����:JSD1412
 * ʱ��:2015-1-16 ����2:35:12
 */
public class IntegerDemo1 {
	public static void main(String[] args) {

		//��������

		//*��ȡ����ʱ����
		Class<?> c1 = Integer.TYPE;
		System.out.println(c1);

		//32����λλ
		//System.out.println(Integer.SIZE);

		//*��ȡint��Χ��ֵ
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		//����ָ��������ֵ������һ��Integer����
		Integer i1 = new Integer(10);//�ѻ�������ת���ɰ�װ��
		System.out.println(i1);

		//����ָ�����ַ���������һ��Integer����
		//�Ѵ������ַ���ת���ɰ�װ��,�����׳��쳣:java.lang.NumberFormatException
		Integer i2 = new Integer("10");
		System.out.println(i2);

		//JDK5.0֮���ṩ��һ��ȫ�µļ��� -- �Զ������,�������ͺͰ�װ���͵�ֱ�ӻ�ת
		Integer i3 = 10;//�Զ�����,�ѻ�������ת���ɰ�װ��
		int i4 = i3;//�Զ�����,�Ѱ�װ��ת���ɻ�������

		//ע��:�Զ���������IntegerDemo2.java

		//���÷���

		//���ַ���ת���ɰ�װ��
		Integer i5 = Integer.decode("123");

		//�Ѱ�װ��ת���ɻ�������
		int i6 = i1.intValue();

		//���ַ���ת���ɻ�������
		int i7 = Integer.parseInt("123");

		//������ת���ɶ�Ӧ�Ľ�����
		String binary = Integer.toBinaryString(10);
		String octal = Integer.toOctalString(10);
		String hex = Integer.toHexString(10);

		//�ѻ������ͻ����ַ���ת���ɰ�װ��
		Integer i8 = Integer.valueOf(10);
		Integer i9 = Integer.valueOf("10");
	}
}
