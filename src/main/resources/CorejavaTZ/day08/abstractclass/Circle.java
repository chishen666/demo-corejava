package com.corejava.day08.abstractclass;

public class Circle extends Shape{
	private double radius;

	public Circle() {

	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	//一个类继承抽象父类,则要求重写父类中所有的抽象方法
	//除非,这个子类也是抽象类
	@Override
	public double girth() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
