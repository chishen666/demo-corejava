package com.corejava.day06;

/**形状父类*/
public class Shape {

	
	//这两个方法的实现是没有用的,因为会被子类的实现给覆盖
	//它们的存在是了多态时,可以调用到这两个方法.
	public double girth() {
		return 0.0;
	}

	public double area() {
		return 0.0;
	}
}
