package com.corejava.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ����������ʾJavaʱ��򵥸�ʽ��
 *
 * ����:JSD1412
 * ʱ��:2015-1-6 ����9:27:01
 */
public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		//��ȡϵͳʱ��
		Date now = new Date();
		System.out.println(now);
		
		//������ʱ���ʽ������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		//���ø�ʽ������
		String time = sdf.format(now);//��Date����ת����String
		System.out.println(time);
		
		
		//���������ַ���,������ַ������� >= ʱ��ģ��(�������ֲ���������)
		Date before = null;
		try {
			before = sdf.parse("2012/12/21 8:8:8");
		} catch (ParseException e) {
			//e.printStackTrace();
			System.err.println("����ʧ��!");
		}
		System.out.println(before);
	}
}
