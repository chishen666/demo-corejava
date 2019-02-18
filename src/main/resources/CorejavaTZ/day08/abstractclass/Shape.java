package com.corejava.day08.abstractclass;

/**形状抽象类*/
public abstract class Shape {
	
	//属性
	private String type;
	
	//构造
	public Shape() {

	}

	public Shape(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	//抽象方法,没有任何实现
	public abstract double girth();
	
	public abstract double area();
}
