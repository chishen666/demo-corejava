package com.corejava.day06;

/**水果父类*/
public class Fruit {
	
	//父类的属性
	private String color;
	private double price;
	
	public Fruit() {
		System.out.println("--父类空参构造.");
	}

	public Fruit(String color, double price) {
		this.color = color;
		this.price = price;
		System.out.println("--父类有参构造.");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
