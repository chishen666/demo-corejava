package com.corejava.day07;

public class Rect extends Shape {

	private int l;
	private int w;

	public Rect() {

	}

	public Rect(int l, int w) {
		super();
		this.l = l;
		this.w = w;
	}

	/*public static Rect getInstance() {
		return new Rect();
	}*/

	@Override
	public double area() {
		return l * w;
	}
}
