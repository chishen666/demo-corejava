package com.corejava.day01;

/**
 * ����������ʾjava.lang.Math,��ѧ��
 * 
 * �����ṩ����ѧ��صĳ��÷���
 *
 * ����:JSD1412
 * ʱ��:2014-12-31 ����2:41:20
 */
public class MathDemo {
	public static void main(String[] args) {
		
		//��ȡPIֵ
		System.out.println("PI = " + Math.PI);

		//�����ֵ
		System.out.println("-8�ľ���ֵ��:" + Math.abs(-8));

		//�����ֵ����Сֵ
		System.out.println("�ϴ�ֵ��:" + Math.max(3, 8));

		System.out.println("��Сֵ��:" + Math.min(9, 2));

		//��ϰ:���2,9,5����Сֵ
		System.out.println("��Сֵ��:" + Math.min(Math.min(9, 2), 5));

		//ָ������,2��4�η�
		System.out.println(Math.pow(2, 4));

		//ƽ����
		System.out.println(Math.sqrt(9));

		//�������,��Χ[0,1)
		System.out.println(Math.random());

		//�ı䷶Χ,1-9���������
		System.out.println((int) (Math.random() * 9 + 1));
	}
}
