package com.corejava.day10;

/**
 * 本类用来演示java.lang.Object类clone()方法
 * 
 * 要求:
 * 1.重写clone()方法,把修饰符从protected改成public
 * 2.被克隆的对象必须实现克隆标记接口:java.lang.Cloneable,否则会抛出
 *   克隆不支持异常:java.lang.CloneNotSupportedException
 *
 * 作者:JSD1412
 * 时间:2015-1-16 下午1:55:33
 */
public class ObjectDemo4 {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Sherlock", new Clazz(10, "AA"));

		try {
			Student s2 = (Student) s1.clone();

			//证明拷贝的底层原理:
			//浅层复制,基本类型拷贝一份,对象类型共享
			//深层复制,任何类型都拷贝一份给新对象
			
			//1.基本类型(特殊对象类型,Date和String)是直接拷贝一份给新对象
			s1.setName("Holmes");
			System.out.println(s2.getName());
			
			//2.对象类型是共享的
			s1.getClazz().setCap(20);
			System.out.println(s2.getClazz().getCap());
			
			//结论:Object中的clone()方法默认就是浅层复制,为了降低程序的资源消耗,提高性能

		} catch (CloneNotSupportedException e) {
			//e.printStackTrace();
			System.err.println("对象不支持克隆...");
		}
	}
}
