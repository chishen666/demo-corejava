package com.corejava.day06;

public class TestShape {
	public static void main(String[] args) {

		Rect r = new Rect(3, 4);
		System.out.println(r.girth());
		System.out.println(r.area());

		Circle c = new Circle(5.0);
		System.out.println(c.girth());
		System.out.println(c.area());

		System.out.println("-------------------");

		//∂‡Ã¨
		Shape s1 = new Rect(3, 4);
		Shape s2 = new Circle(5.0);
		Shape s3 = new Square(4);

		Shape[] shapes = new Shape[3];
		shapes[0] = s1;
		shapes[1] = s2;
		shapes[2] = s3;

		for (Shape s : shapes) {
			System.out.println(s.girth());
			System.out.println(s.area());
		}
	}
}
