package com.corejava.day01;

//2.����
import java.util.Random;

/**
 * ����������ʾJava��������������ַ�ʽ
 * 
 * java.util.Random��
 *
 * ����:JSD1412
 * ʱ��:2015-1-4 ����1:43:23
 */
public class RandomDemo2 {
	public static void main(String[] args) {
		
		//1.�������������
		Random rd = new Random();
		
		//3.ͨ��������÷���
		int i = rd.nextInt();//��ȡint��Χ�ڵ��������
		
		double d = rd.nextDouble();//��ȡ���������
		
		System.out.println(i);
		System.out.println(d);
		
		//�ı䷶Χ
		int i2 = rd.nextInt(10);//����[0,10)���������
		System.out.println(i2);
	}
}
