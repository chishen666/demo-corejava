package com.corejava.day07;

/**业务类*/
public class ShapeService {

	private static ShapeService ss = new ShapeService();

	private ShapeService() {

	}

	public static ShapeService getInstance() {
		return ss;
	}

	//面向父类编程--方法的参数列表写成父类
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
