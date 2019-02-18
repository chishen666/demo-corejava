package com.corejava.day07;

/**��״������ -- �������𴴽����ֲ�ͬ�Ķ���,��д����������ͬһ������*/
public class ShapeFactory {
	//����
	public static final int CIRCLE = 1;
	public static final int RECT = 2;
	
	//��������--�����ķ�������д�ɸ���
	public static Shape getInstance(int type) {
		Shape s = null;
		if (type == CIRCLE) {
			s = new Circle();
		} else if (type == RECT) {
			s = new Rect();
		} else {
			System.out.println("�Բ���,�������Ϸ�!");
		}
		return s;
	}
}
