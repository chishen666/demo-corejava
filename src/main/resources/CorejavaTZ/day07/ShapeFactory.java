package com.corejava.day07;

/**形状工厂类 -- 用来负责创建各种不同的对象,这写对象都是属于同一个父类*/
public class ShapeFactory {
	//常量
	public static final int CIRCLE = 1;
	public static final int RECT = 2;
	
	//面向父类编程--方法的返回类型写成父类
	public static Shape getInstance(int type) {
		Shape s = null;
		if (type == CIRCLE) {
			s = new Circle();
		} else if (type == RECT) {
			s = new Rect();
		} else {
			System.out.println("对不起,参数不合法!");
		}
		return s;
	}
}
