package com.corejava.day16;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * ����������ʾע���������ƾ�����Ϣ
 *
 * ����:JSD1412
 * ʱ��:2015-1-23 ����5:00:40
 */

//@SuppressWarnings({ "unused", "deprecation" ,"rawtypes","resource"})

@SuppressWarnings("all")
public class SuppressWarningsTest{
	
	//@SuppressWarnings({ "unused", "deprecation" })
	public static void main(String[] args) {
		
		//�������ȴû��ʹ��
		int i = 3;
		
		//���϶���û�з���
		//@SuppressWarnings("rawtypes")
		List list = new ArrayList();
		
		//������һ�����Ƽ���ʹ�÷���
		new Date().getHours();
		
		//@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a);
	}
}
