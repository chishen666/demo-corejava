package com.corejava.day07;

/**
 * 本类用来演示Java单例设计模式
 *
 * 作者:JSD1412
 * 时间:2015-1-13 下午4:05:46
 */
public class SingletonDemo {

	//饿汉模式,无论是否使用,都自动创建单例实例
	//2.提供静态返回当前对象的唯一实例
	private static SingletonDemo sd = new SingletonDemo();
	
	//1.私有化构造方法 -- 保证外界无法new
	private SingletonDemo() {

	}
	
	//3.提供公开静态的方法来返回当前对象的唯一实例属性
	public static SingletonDemo getInstance(){
		return sd;
	}

	//懒汉模式--用到对象时再创建,延迟加载
	/*private static SingletonDemo sd = null;

	private SingletonDemo() {

	}

	public static synchronized SingletonDemo getInstance() {
		if (sd == null) {
			sd = new SingletonDemo();
		}
		return sd;
	}*/
}
