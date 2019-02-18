package com.corejava.day10;

import com.corejava.day06.Rect;
import com.corejava.day06.Shape;

/**
 * 本类用来演示java.lang.Object类getClass()方法
 *
 * 作者:JSD1412
 * 时间:2015-1-16 上午9:31:28
 */
public class ObjectDemo1 {
	public static void main(String[] args) {
		Shape s1 = new Rect();
		Shape s2 = new Rect();

		//泛型通配
		Class<?> cc1 = s1.getClass();//反射技术的基础方法
		Class<?> cc2 = s2.getClass();

		System.out.println(cc1);
		System.out.println(cc2);

		//一个类无论实例化了多少对象,它的Class实例永远只有一个!
		System.out.println(cc1 == cc2);
		
		//利用反射获取类的信息(以后再说)
		//System.out.println(c1.getSuperclass().getName());
		
		
		//此方法的另外一个作用
		System.out.println(s1 instanceof Rect);
		
		//相当于
		System.out.println(s1.getClass() == Rect.class);
		
		System.out.println("-----------------------------------");
		
		//获取class实例的5种方式
		
		//1.Object中的getClass()方法
		Class<?> c1 = s1.getClass();
		
		//2.类名.class属性
		Class<?> c2 = Rect.class;
		
		//3.Class.forName("类的全限定名");此方法强制处理异常
		//如果类的全限定名错误,则抛出异常:ClassNotFoundException
		Class<?> c3 = null;
		try {
			c3 = Class.forName("com.corejava.day06.Rect");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("没有找到相关类.");
		}
		
		//4.基本类型.class
		Class<?> c4 = int.class;
		
		//5.对象类型.TYPE
		Class<?> c5 = Integer.TYPE;
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c4 == c5);
	}
}
