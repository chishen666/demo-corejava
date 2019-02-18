package com.corejava.day06;

/**猫的子类*/
public class Cat extends Animal {

	//子类的属性,都是特性属性(请问,此时,猫有几个属性?)
	private double meng;//萌度

	public Cat() {

	}

	//根据父类创建构造方法过后要手动添加自己特性属性,并且赋值
	public Cat(String type, String name, double meng) {
		super(type, name);
		this.meng = meng;
	}

	//添加自己特有属性的get/set方法
	public double getMeng() {
		return meng;
	}

	public void setMeng(double meng) {
		this.meng = meng;
	}

	//子类特有的方法
	public void catchMouse() {
		System.out.println("猫抓老鼠的方法...");
	}
	
	@Override
	public void eat() {
		System.out.println("猫在吃鱼...");
	}
}
