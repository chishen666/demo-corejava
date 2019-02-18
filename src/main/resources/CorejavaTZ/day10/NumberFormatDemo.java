package com.corejava.day10;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * ����������ʾjava.lang.NumberFormat
 *
 * ����:JSD1412
 * ʱ��:2015-1-16 ����5:01:08
 */
public class NumberFormatDemo {
	public static void main(String[] args) {
		double d = 567556789.46565757;

		//1.�������ָ�ʽ��ģ��

		//��ȡ��ǰϵͳ�����µ�Ĭ����ֵ��ʽ
		//NumberFormat nf = NumberFormat.getInstance();
		
		//��ȡ��ǰϵͳ�����µ�Ĭ�ϻ��Ҹ�ʽ
		//NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		//��ȡָ�����ҵĻ��Ҹ�ʽ
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		
		//����С������������������Сλ��
		nf.setMaximumFractionDigits(5);
		nf.setMinimumFractionDigits(3);
		
		//������������������������Сλ��
		nf.setMaximumIntegerDigits(10);//�˷���ע����ֵ��Χ
		nf.setMinimumIntegerDigits(5);
		
		//2.���ø�ʽ������
		String s = nf.format(d);
		System.out.println(s);
	}
}
