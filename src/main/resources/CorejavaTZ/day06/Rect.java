package com.corejava.day06;

/**��������*/
public class Rect extends Shape {

	//��������
	private double length;
	private double width;

	public Rect() {

	}

	public Rect(double length, double width) {
		this.length = length;
		this.width = width;
	}

	//��������д,���෽���Ѹ��෽������
	@Override
	public double girth() {
		return 2 * (length + width);
	}

	@Override
	public double area() {
		return length * width;
	}
}
