package com.corejava.day10.String;

/**
 * ����������ʾStringBuilder�еĳ��÷���
 *
 * ����:JSD1412
 * ʱ��:2015-1-19 ����2:29:34
 */
public class StringBuilderMethodDemo {
	
	//Ĭ��16���ַ��Ļ��嵥λ
	private static StringBuilder builder = new StringBuilder();
	//private static StringBuffer buffer = new StringBuffer();
	
	public static void main(String[] args) {
		
		StringBuilder builder1 = new StringBuilder(10);
		StringBuilder builder2 = new StringBuilder("ABC");
		
		//��ȡ�ַ�������������С
		int cap = builder2.capacity();
		System.out.println(cap);
		
		//��ȡ�ַ������������ݵĶ���
		int length = builder2.length();
		System.out.println(length);
		
		//1.ƴ�ӷ���,Ч�ʷǳ���
		builder = builder.append("A").append("B").append("C");
		System.out.println(builder);
		
		//2.ɾ���ַ�����ָ��������ַ���
		StringBuilder builder3 = new StringBuilder("���,Hello,����Java").delete(3, 9);
		System.out.println(builder3);
	
		//ɾ���ַ���ָ���±괦���ַ�
		StringBuilder builder4 = new StringBuilder("ABC").deleteCharAt(1);
		System.out.println(builder4);
		
		//3.���ַ����в���ָ�����ݵ��ִ�
		StringBuilder builder5 = new StringBuilder("AF").insert(1, "BCDE");
		System.out.println(builder5);
		
		//4.�滻�ַ���
		StringBuilder builder6 = new StringBuilder("AbcdeF").replace(1, 5, "Z");
		System.out.println(builder6);
		
		//5.��ת��ǰ�ַ�������
		StringBuilder builder7 = new StringBuilder("AbcdeF");
		builder7 = builder7.reverse();
		System.out.println(builder7);
		
		//6.�޸��ַ�����ָ���±괦���ַ�
		StringBuilder builder8 = new StringBuilder("AbC");
		builder8.setCharAt(1, 'B');//��������void
		System.out.println(builder8);
		
		//7.�����³���
		StringBuilder builder9 = new StringBuilder("ABCDEFG");
		builder9.setLength(10);
		System.out.println(builder9);
	}
}
