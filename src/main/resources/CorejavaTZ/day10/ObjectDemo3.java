package com.corejava.day10;

/**
 * ����������ʾjava.lang.Object��hashCode()��equals()����
 *
 * ����:JSD1412
 * ʱ��:2015-1-16 ����10:57:48
 */
public class ObjectDemo3 {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Sherlock",new Clazz(10,"AA"));
		Student s2 = new Student(101, "Sherlock",new Clazz(10,"AA"));
		
		//�Ⱥ���Զ�Ƚϵ����ڴ��ַ,ֻҪnew,��ַһ����ͬ
		System.out.println(s1 == s2);//false
		
		//equals()����Ĭ�ϱȽϵ�Ҳ���ڴ��ַ,��������һ��
		//����,���Կ�����д���ı����ıȽϹ���
		System.out.println(s1.equals(s2));
		
		//��ӡ����Ĺ�ϣֵ,���ֵ�����������Ͼ������������Ƿ����
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
