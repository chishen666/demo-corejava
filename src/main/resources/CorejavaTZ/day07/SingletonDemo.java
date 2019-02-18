package com.corejava.day07;

/**
 * ����������ʾJava�������ģʽ
 *
 * ����:JSD1412
 * ʱ��:2015-1-13 ����4:05:46
 */
public class SingletonDemo {

	//����ģʽ,�����Ƿ�ʹ��,���Զ���������ʵ��
	//2.�ṩ��̬���ص�ǰ�����Ψһʵ��
	private static SingletonDemo sd = new SingletonDemo();
	
	//1.˽�л����췽�� -- ��֤����޷�new
	private SingletonDemo() {

	}
	
	//3.�ṩ������̬�ķ��������ص�ǰ�����Ψһʵ������
	public static SingletonDemo getInstance(){
		return sd;
	}

	//����ģʽ--�õ�����ʱ�ٴ���,�ӳټ���
	/*private static SingletonDemo sd = null;

	private SingletonDemo() {

	}

	public static synchronized SingletonDemo getInstance() {
		if (sd == null) {
			sd = new SingletonDemo();
		}
		return sd;
	}*/
}
