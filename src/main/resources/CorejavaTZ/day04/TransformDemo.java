package com.corejava.day04;

import java.util.Arrays;

/**
 * ����������ʾJava��������
 *
 * ����:JSD1412
 * ʱ��:2015-1-8 ����4:45:24
 */
public class TransformDemo {

	public static void main(String[] args) {
		/*int a = 10;
		add(a);
		System.out.println(a);//10*/
		
		int[] arr = {1,2,3};
		add(arr);
		System.out.println(Arrays.toString(arr));
	}

	//����������ֵ����
	public static void add(int a) {
		++a;
	}
	
	//�������������ô���
	public static void add(int[] a){
		for(int i = 0;i < a.length;i++){
			a[i] = a[i] + 1;
		}
	}
}
