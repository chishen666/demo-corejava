package com.corejava.day07;

public class Circle extends Shape {

	private double radius;
	
	public int id;

	public Circle() {

	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	/*public static Circle getInstance(){
		return new Circle();
	}*/

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
