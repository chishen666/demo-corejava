package com.corejava.day09.innerclass;

import java.util.Arrays;

/**外部类*/
public class Outer {
	//外部类的属性
	private int id = 1;
	private static int guid = 10;

	private String[] names = { "Jack", "Rose", "Tom", "Mary" };

	//外部类的构造方法
	public Outer() {

	}

	//定义成员内部类
	//public class MemberInner {

	//一般,我们把成员内部类做成私有化的
	private class MemberInner {
		//内部类的属性
		private int id = 2;

		//内部类的方法
		//成员内部类可以访问外部类所有的成员
		public void memberInnerMethod() {
			System.out.println("外部类的id = " + Outer.this.id);
			System.out.println("内部类的id = " + id);
			System.out.println(guid);
			System.out.println(Arrays.toString(names));
		}
	}

	//提供一个方法创建成员内部类对象并且调用方法
	public void memberInnerTest() {
		MemberInner mi = new MemberInner();
		mi.memberInnerMethod();
	}

	//静态内部类
	public static class StaticInner {

		//静态内部类只能访问外界静态成员
		public void staticInnerMethod() {
			//System.out.println(id);
			System.out.println(guid);
			//System.out.println(Arrays.toString(names));
		}
	}

	public void outerMethod1() {

		//定义局部内部类
		class LocalInner {
			//属性
			private int id = 3;

			//方法
			public void localInnerMethod() {
				System.out.println(id);
				System.out.println(Outer.this.id);
				System.out.println(guid);
				System.out.println(Arrays.toString(names));
			}
		}
		//创建局部内部类对象
		LocalInner li = new LocalInner();
		li.localInnerMethod();
	}

	public void outerMethod2() {
		//定义匿名内部类
		new Printable() {
			@Override
			public void method() {
				System.out.println(Arrays.toString(names));
			}
		}.method();
	}
}
