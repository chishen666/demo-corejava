package com.corejava.day04;

/**
 * ����������ʾJava�ݹ��㷨
 *
 * ����:JSD1412
 * ʱ��:2015-1-7 ����4:23:36
 */
public class FacDemo {
	public static void main(String[] args) {
		//System.out.println(fac(10));
		System.out.println(feibo(5));
	}

	//�ݹ��㷨
	public static long fac(int num) {
		//�ݹ����,Ҳ���ǵݹ����������,�����ָ���˳�����,��
		//�׳���ջ�������:java.lang.StackOverflowError;
		if (num == 1) {
			return 1;
		}
		return num * fac(num - 1);
	}

	/**
	 * ����ָ��λ��,ȷ����λ���ϵ�쳲����������Ƕ���
	 */
	public static long feibo(int pos) {
		if(pos == 1 || pos == 2){
			return 1;
		}
		return feibo(pos - 1) + feibo(pos - 2);
	}
}
