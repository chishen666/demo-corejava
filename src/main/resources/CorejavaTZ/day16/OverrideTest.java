package com.corejava.day16;

/**
 * ����������ʾJavaע��@Override,������ⷽ���Ƿ�����д����
 *
 * ����:JSD1412
 * ʱ��:2015-1-23 ����4:50:17
 */
public class OverrideTest {
	public static void main(String[] args) {
		Super s = new Sub();
		s.method();
	}
}

class Super{
	public void method(){
		System.out.println("����");
	}
}

class Sub extends Super{
	@Override
	public void method() {
		System.out.println("����");
	}
}