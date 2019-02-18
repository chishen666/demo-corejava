package com.corejava.day07;

/**ҵ����*/
public class ShapeService {

	private static ShapeService ss = new ShapeService();

	private ShapeService() {

	}

	public static ShapeService getInstance() {
		return ss;
	}

	//��������--�����Ĳ����б�д�ɸ���
	/*public void printArea(Circle circle) {
		System.out.println(circle.area());
	}
	
	public void printArea(Rect rect) {
		System.out.println(rect.area());
	}*/

	public void printArea(Shape s) {
		System.out.println(s.area());
	}
}
