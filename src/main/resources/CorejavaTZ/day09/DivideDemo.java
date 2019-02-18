package com.corejava.day09;

/**
 * ����������ʾJava�쳣��ʹ��
 *
 * ����:JSD1412
 * ʱ��:2015-1-15 ����2:40:28
 */
public class DivideDemo {

	public static void main(String[] args) {
		Double d1 = 9.0;
		Double d2 = 0.0;
		try {
			System.out.println(divide(d1, d2));
		} catch (NullPointerException e) {
			System.out.println("�������߱���������Ϊ��!");
			//...
		} catch (DivideNotZeroException e) {
			System.out.println("��������Ϊ0!");
			//...
		}
	}

	public static double divide(Double d1, Double d2)
			throws NullPointerException, DivideNotZeroException {

		//�ǿ��ж�
		if (d1 == null || d2 == null) {
			//�׳��쳣
			throw new NullPointerException("�������߱���������Ϊ��!");
		}

		//�жϳ����Ƿ�Ϊ0
		if (d2 == 0) {
			throw new DivideNotZeroException("��������Ϊ0!");
		}
		return d1 / d2;
	}
}
