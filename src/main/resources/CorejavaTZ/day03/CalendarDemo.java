package com.corejava.day03;

import java.util.Calendar;
import java.util.Date;

/**
 * ����������ʾJava������
 *
 * ����:JSD1412
 * ʱ��:2015-1-6 ����10:38:56
 */
public class CalendarDemo {
	public static void main(String[] args) {
		//��ȡ��ǰϵͳĬ������
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);

		//�����Ļ�����,�����﷨��ͬ��
		//Calendar cal = new GregorianCalendar();

		//get������ȡ������Ϣ
		//��ȡ���ڼ�,��Χ1-7,Ĭ����������1
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));

		//��ȡ���
		System.out.println(cal.get(Calendar.YEAR));

		//��ȡ�·�,��Χ��0~11,һ����0
		System.out.println(cal.get(Calendar.MONTH));

		//��ȡ����
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));

		//��ȡʱ
		System.out.println(cal.get(Calendar.HOUR));//12
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));//24

		//��ȡ����
		System.out.println(cal.get(Calendar.MINUTE));

		//��ȡ��
		System.out.println(cal.get(Calendar.SECOND));

		//�����޸�����
		//ͨ�������޸�����ĳһ������
		//cal.set(Calendar.YEAR, 2000);

		//һ�������ö������
		//cal.set(2012, 12 - 1, 21);
		cal.set(2012, 12 - 1, 21, 8, 8, 8);
		
		//ͨ��������ȡϵͳʱ��
		Date time = cal.getTime();//������ת��������,Calendar -> Date
		System.out.println(time);
	}
}
