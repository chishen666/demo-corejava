package com.carrx.designpattern.singleton;
/**
 * 单例模式（饿汉式）
 *
 * @Author: Carl.Xiang
 * @Date: 2020/2/2 11:14
 **/
public class SingletonHungry {

	private static final SingletonHungry instance = new SingletonHungry();

	private SingletonHungry() {
	}

	public static SingletonHungry getInstance() {
		return instance;
	}
}
