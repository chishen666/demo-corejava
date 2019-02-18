package com.corejava.day10;

import com.corejava.day06.Rect;
import com.corejava.day06.Shape;

/**
 * ����������ʾjava.lang.Object��getClass()����
 *
 * ����:JSD1412
 * ʱ��:2015-1-16 ����9:31:28
 */
public class ObjectDemo1 {
	public static void main(String[] args) {
		Shape s1 = new Rect();
		Shape s2 = new Rect();

		//����ͨ��
		Class<?> cc1 = s1.getClass();//���似���Ļ�������
		Class<?> cc2 = s2.getClass();

		System.out.println(cc1);
		System.out.println(cc2);

		//һ��������ʵ�����˶��ٶ���,����Classʵ����Զֻ��һ��!
		System.out.println(cc1 == cc2);
		
		//���÷����ȡ�����Ϣ(�Ժ���˵)
		//System.out.println(c1.getSuperclass().getName());
		
		
		//�˷���������һ������
		System.out.println(s1 instanceof Rect);
		
		//�൱��
		System.out.println(s1.getClass() == Rect.class);
		
		System.out.println("-----------------------------------");
		
		//��ȡclassʵ����5�ַ�ʽ
		
		//1.Object�е�getClass()����
		Class<?> c1 = s1.getClass();
		
		//2.����.class����
		Class<?> c2 = Rect.class;
		
		//3.Class.forName("���ȫ�޶���");�˷���ǿ�ƴ����쳣
		//������ȫ�޶�������,���׳��쳣:ClassNotFoundException
		Class<?> c3 = null;
		try {
			c3 = Class.forName("com.corejava.day06.Rect");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("û���ҵ������.");
		}
		
		//4.��������.class
		Class<?> c4 = int.class;
		
		//5.��������.TYPE
		Class<?> c5 = Integer.TYPE;
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c4 == c5);
	}
}
