package com.corejava.day06;

/**ˮ������*/
public class Fruit {
	
	//���������
	private String color;
	private double price;
	
	public Fruit() {
		System.out.println("--����ղι���.");
	}

	public Fruit(String color, double price) {
		this.color = color;
		this.price = price;
		System.out.println("--�����вι���.");
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
