package com.corejava.day08.abstractclass;

/**
 * ����������ʾJavaģ�����ģʽ
 *
 * ����:JSD1412
 * ʱ��:2015-1-14 ����10:52:27
 */

//����ģ����
public abstract class Travel {

	//1.������������Ҫ�����в���

	//ȥ
	public abstract void go();

	//��
	public abstract void play();

	//��
	public abstract void back();

	//2.�ṩһ������ҵ�����̷���,����һ����˳��ִ��������������
	public final void topMethod() {
		//...
		go();
		//...
		play();
		//...
		back();
		//...
	}
}
