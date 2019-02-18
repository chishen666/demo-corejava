package com.corejava.day10;

/**
 * 本类用来演示java.lang.Object类hashCode()和equals()方法
 *
 * 作者:JSD1412
 * 时间:2015-1-16 上午10:57:48
 */
public class ObjectDemo3 {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Sherlock",new Clazz(10,"AA"));
		Student s2 = new Student(101, "Sherlock",new Clazz(10,"AA"));
		
		//等号永远比较的是内存地址,只要new,地址一定不同
		System.out.println(s1 == s2);//false
		
		//equals()方法默认比较的也是内存地址,但是它是一个
		//方法,所以可以重写来改变它的比较规则
		System.out.println(s1.equals(s2));
		
		//打印对象的哈希值,这个值在真正意义上决定两个对象是否相等
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
