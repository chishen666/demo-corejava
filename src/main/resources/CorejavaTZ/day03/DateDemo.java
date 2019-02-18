package com.corejava.day03;

import java.util.Date;

/**
 * ����������ʾJava������
 *
 * ����:JSD1412
 * ʱ��:2015-1-5 ����4:09:25
 */
public class DateDemo {
	public static void main(String[] args) {
		//��ȡ��ǰϵͳʱ��
		Date now = new Date();
		System.out.println(now);

		//��ʱ�ķ���,���Ƽ�ʹ��,���ǹ��ܻ��ǿ���ʹ�õ�
		System.out.println(now.getYear());

		//��ʱ�����õ�ָ��λ��,�·�0~11,����1-7,��������1
		Date time = new Date(2014 - 1900, 1 - 1, 5, 8, 8, 8);
		System.out.println(time);
		
		//�ж������Ƿ��ڸ�������֮ǰ
		System.out.println(now.before(time));
		
		//�ж������Ƿ��ڸ�������֮��
		System.out.println(now.after(time));
		
		
		//��ʱ��������� -- ��ʱ��ת���ɺ�����мӼ�����
		
		//1.System.currentTimeMillies();
		//��ȡ��ǰϵͳʱ��ĺ�����
		long l1 = System.currentTimeMillis();//�˷���������Ϊ���ܼ��ʹ��
		System.out.println(l1);
		
		//2.getTime()����
		long l2 = time.getTime();
		System.out.println(l2);
		
		
		//�Ѻ�����ת����ʱ��
		//1.
		Date date = new Date(l2);
		System.out.println(date);
		
		//2.
		time.setTime(l2);
		System.out.println(time);
	}
}
