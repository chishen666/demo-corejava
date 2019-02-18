package com.corejava.day07;

/**
 * ����������ʾJava��̬�����
 *
 * ����:JSD1412
 * ʱ��:2015-1-13 ����3:44:00
 */
public class StaticBlockDemo {
	
	//����
	public static final int ROWS;

	//��ͨ�����,ֻҪ��������,�ͻ�����ִ��һ��
	//һ�������,��д,��Ϊ���԰�������Ĵ���д�ڹ��췽����.
	{
		System.out.println("��ͨ�����...");
	}

	//��̬�����������ص�ʱ��ͻᱻ����,����ִֻ��һ��
	//һ������ʱ,��������ֻ��Ҫִ��һ�ε����Ĵ���ϵͳ��Դ�Ĺ���
	static {
		//ע��:��̬�������Գ�ʼ����������!!!
		ROWS = 10;
		System.out.println("��̬�����...");
	}

	public StaticBlockDemo() {
		System.out.println("���췽��...");
	}
	
	public static void main(String[] args) {
		StaticBlockDemo s1 = new StaticBlockDemo();
		StaticBlockDemo s2 = new StaticBlockDemo();
		StaticBlockDemo s3 = new StaticBlockDemo();
	}
}
