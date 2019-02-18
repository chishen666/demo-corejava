package com.corejava.day15;

public class Point {
	private int x;
	private int y;

	public Point() {
		System.out.println("Point()被调用了");
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("Point(x,y)被调用了");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void doSomething() {
		System.out.println("--doSometing()被调用.");
	}

	public void doSomething(int x, String str) {
		System.out.println("--doSometing(x,str)被调用.");
		System.out.println("x = " + x);
		System.out.println("str = " + str);
	}

	public static void method() {
		System.out.println("method()静态方法被调用");
	}

	public String doReturnMethod() {
		return "doReturnMethod()被调用了.";
	}

	private void doMethod() {
		System.out.println("doMethod()私有方法被调用了.");
	}

	@Override
	public String toString() {
		return "X = " + x + ", Y = " + y;
	}
}
