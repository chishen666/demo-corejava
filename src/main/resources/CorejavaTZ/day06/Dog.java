package com.corejava.day06;

/**狗的子类*/
public class Dog extends Animal {

	//特有属性
	private double loyal;//忠臣度

	public Dog() {

	}

	public Dog(String type, String name, double loyal) {
		super(type, name);
		this.loyal = loyal;
	}

	public double getLoyal() {
		return loyal;
	}

	public void setLoyal(double loyal) {
		this.loyal = loyal;
	}
	
	//特有方法
	public void watchDoor(){
		System.out.println("狗在看门...");
	}
	
	@Override
	public void eat() {
		System.out.println("狗在啃骨头...");
	}
}
