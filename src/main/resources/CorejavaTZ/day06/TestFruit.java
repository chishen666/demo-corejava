package com.corejava.day06;

/**测试类*/
public class TestFruit {
	public static void main(String[] args) {
		
		//创建子类对象
		Apple apple = new Apple("红色",5);

		//通过继承过来的set方法赋值
		//apple.setColor("红色");
		//apple.setPrice(5);
		
		System.out.println(apple.getColor());
		
		Apple apple2 = new Apple();
	}
}
