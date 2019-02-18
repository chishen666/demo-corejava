package com.corejava.day06;

/**动物父类*/
public class Animal {
	//公共属性,所有子类都含有的属性
	private String type;
	private String name;
	
	public Animal() {

	}

	public Animal(String type, String name) {
		this.type = type;
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//公共的方法
	public void eat(){
		System.out.println("动物吃的方法...");
	}
}
