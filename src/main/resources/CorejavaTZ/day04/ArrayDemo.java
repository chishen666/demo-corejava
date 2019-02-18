package com.corejava.day04;

import java.util.Arrays;

/**
 * ����������ʾJava����Ķ���,��ֵ,����
 *
 * ����:JSD1412
 * ʱ��:2015-1-8 ����10:20:37
 */
public class ArrayDemo {
	public static void main(String[] args) {
		//��������
		int[] arr1 = new int[5];//����ĳ��ȱ���Ҫ��,��һ��ȷ��,�ǲ����Ըı��
		int arr2[] = new int[5];

		String[] arr3 = new String[3];

		String[] arr4;
		arr4 = new String[5];

		//ͨ��������.length����ȡ����ĳ���
		System.out.println(arr1.length);

		//ͨ���±��������Ԫ��
		System.out.println(arr1[2]);//��������arr1�ĵ�����Ԫ��

		//��������ʱ,����±곬����Χ,���׳������±�Խ���쳣:java.lang.ArrayIndexOutOfBoundsException
		//System.out.println(arr1[5]);//�����׳��쳣

		//����Ԫ�صĸ�ֵ

		//1.���������ͬʱֱ�Ӹ�ֵ(�Զ���С��������)
		int[] arr5 = { 2, 7, 4, 7, 1 };
		//��ȫ�ȼ���
		int[] arr6 = new int[] { 2, 7, 4, 7, 1 };//��д��[]�в���д������

		//2.forѭ����ֵ(�Զ�����������,�����������й��ɻ����������)
		int[] arr7 = new int[10];
		for (int i = 0; i < arr7.length; i++) {//ѭ�������±귶Χ
			//arr7[i] = i + 1;

			arr7[i] = (int) (Math.random() * 10 + 1);//���
		}

		//3.java.util.Arrays���鹤����,fill(...),��䷽��
		//Arrays.fill(arr4, "Java");//��ֵ���������е�Ԫ��
		Arrays.fill(arr4, 1, 3, "Java");//��ֵָ����Χ�ڵ�Ԫ��(ǰ�պ�)

		//4.ͨ���±�һһ��ֵ(һ�������޸�ĳ��ֵ)
		/*arr1[0] = 5;
		arr1[1] = 3;
		arr1[2] = 7;*/

		//����Ԫ�صı���,Ҳ��������
		//1.java.util.Arrays���鹤�����е�toString(������)����,������ת����ָ����ʽ���ַ���
		//[e1, e2, e3 ,....]
		System.out.println(Arrays.toString(arr4));

		//2.��ͨforѭ��
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}

		//3.��ǿforѭ��,JDK5.0��ʼ
		//a.��д���
		//b.���Ա�������
		for (String s : arr4) {
			System.out.println(s);
		}

		//4.ͨ���±�һһ��ӡ
		/*System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
		System.out.println(arr4[3]);
		...*/

		//5.�Զ����������
		printArray(arr5);
	}

	/**
	 * ��ӡ������Զ��巽��
	 */
	public static void printArray(int[] arr) {
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
		}
		System.out.println("}");
	}

}
