package com.corejava.day07;

/**
 * 本类用来演示Java静态代码块
 *
 * 作者:JSD1412
 * 时间:2015-1-13 下午3:44:00
 */
public class StaticBlockDemo {
	
	//常量
	public static final int ROWS;

	//普通代码块,只要创建对象,就会优先执行一次
	//一般情况下,不写,因为可以把它里面的代码写在构造方法中.
	{
		System.out.println("普通代码块...");
	}

	//静态代码块在类加载的时候就会被运行,并且只执行一次
	//一般做费时,费力并且只需要执行一次的消耗大量系统资源的工作
	static {
		//注意:静态代码块可以初始化常量属性!!!
		ROWS = 10;
		System.out.println("静态代码块...");
	}

	public StaticBlockDemo() {
		System.out.println("构造方法...");
	}
	
	public static void main(String[] args) {
		StaticBlockDemo s1 = new StaticBlockDemo();
		StaticBlockDemo s2 = new StaticBlockDemo();
		StaticBlockDemo s3 = new StaticBlockDemo();
	}
}
