package com.corejava.day07;

//��̬���� -- ����ShapeFactory�������еľ�̬��Ա
import static com.corejava.day07.ShapeFactory.*;

public class TestShape {
	public static void main(String[] args) {

		//��������--����ı���ʱ����д�ɸ���

		//Shape c = new Circle(3.0);

		//ͨ�����������������״
		//Shape c = ShapeFactory.getInstance(1);

		//Shape r = new Rect(2, 3);
		//Shape r = ShapeFactory.getInstance(2);

		//���볣��,��߿ɶ���
		//Shape c = ShapeFactory.getInstance(ShapeFactory.CIRCLE);
		//Shape r = ShapeFactory.getInstance(ShapeFactory.RECT);

		//�ϳ�
		//Shape s = ShapeFactory.getInstance(ShapeFactory.RECT);

		//���뾲̬��������հ汾:
		Shape s = getInstance(CIRCLE);
		
		//����ҵ�������
		//ShapeService ss = new ShapeService();
		
		ShapeService ss = ShapeService.getInstance();

		ss.printArea(s);
	}
}
