package com.corejava.day05;

/**测试类*/
public class TestEmployee {
	public static void main(String[] args) {
		//创建对象,从类别中实例化一个具体的员工对象
		//创建对象就是调用相应的构造方法
		Employee e1 = new Employee();

		//给公开属性赋值
		/*e1.id = 1;
		e1.name = "Jack";

		//调用员工的属性
		System.out.println(e1.id);
		System.out.println(e1.name);

		Employee e2 = new Employee();
		e2.id = 2;
		e2.name = "Rose";
		System.out.println(e2.id);
		System.out.println(e2.name);*/

		//获取私有属性
		System.out.println(e1.getAge());

		//给私有属性赋值
		e1.setAge(30);

		e1.setAge(300);

		System.out.println(e1.getAge());

		e1.setName("Jack");
		System.out.println(e1.getName());
		e1.setName("习近平");
		System.out.println(e1.getName());
		
		
		//通过构造方法来给属性赋值
		Employee e3 = new Employee(100, "Tom", -32,9000);
		System.out.println(e3.getAge());
	}
}
