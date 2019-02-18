package com.corejava.day16;

/**
 * 本类用来演示Java注解@Override,用来检测方法是否是重写方法
 *
 * 作者:JSD1412
 * 时间:2015-1-23 下午4:50:17
 */
public class OverrideTest {
	public static void main(String[] args) {
		Super s = new Sub();
		s.method();
	}
}

class Super{
	public void method(){
		System.out.println("父类");
	}
}

class Sub extends Super{
	@Override
	public void method() {
		System.out.println("子类");
	}
}