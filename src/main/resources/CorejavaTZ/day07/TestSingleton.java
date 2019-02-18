package com.corejava.day07;

public class TestSingleton {
	public static void main(String[] args) {

		//只要new就说明开辟新空间,来存放新对象
		//SingletonDemo s1 = new SingletonDemo();
		//SingletonDemo s2 = new SingletonDemo();
		
		SingletonDemo s1 = SingletonDemo.getInstance();
		SingletonDemo s2 = SingletonDemo.getInstance();

		//比较对象内存地址是否相同
		System.out.println(s1 == s2);
	}
}
