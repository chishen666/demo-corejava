package com.corejava.day06;

/**苹果子类*/
public class Apple extends Fruit {

	public Apple() {
		//创建子类对象的同时会优先创建父类对象,
		//如果创建父类对象时调用的是有参构造,则正常调用
		//如果调用的是空参构造,则super()可以省略
		//super();
		System.out.println("--子类空参构造.");
	}

	/*public Apple(String color,double price){
		this.color = color;
		this.price = price;
	}*/

	public Apple(String color, double price) {
		//super关键字表示调用父类中已经存在的某一个构造方法
		//此写法要求写在构造方法的第一行
		super(color, price);
		System.out.println("--子类有参构造.");
	}
}
