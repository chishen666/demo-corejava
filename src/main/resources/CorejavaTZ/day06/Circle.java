package com.corejava.day06;

/**Ô²µÄ×ÓÀà*/
public class Circle extends Shape{
	private double radius;

	public Circle() {

	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double girth() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
