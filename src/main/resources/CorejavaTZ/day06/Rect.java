package com.corejava.day06;

/**矩形子类*/
public class Rect extends Shape {

	//特有属性
	private double length;
	private double width;

	public Rect() {

	}

	public Rect(double length, double width) {
		this.length = length;
		this.width = width;
	}

	//方法的重写,子类方法把父类方法覆盖
	@Override
	public double girth() {
		return 2 * (length + width);
	}

	@Override
	public double area() {
		return length * width;
	}
}
