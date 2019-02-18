package com.corejava.day05;

/**员工类 -- 实体类(Entity)*/
public class Employee {

	//属性
	private int id;
	private String name;
	private int age;
	private double salary;

	//如果实体类中没有添加任何构造方法,则系统会自动创建一个空参构造供创建对象使用
	//如果实体类中已经存在某一个构造方法,则空参构造就不会自动创建了.
	//空参构造方法
	public Employee() {

	}

	//有参数的构造方法
	public Employee(int id, String name, int age, double salary) {
		this.id = id;
		//this.name = name;
		setName(name);
		//this.age = age;
		setAge(age);//set方法与构造方法整合实现参数有效性判断能力
		this.salary = salary;
	}

	//存取方法
	//获取方法
	public int getId() {
		return id;
	}

	//设置方法
	public void setId(int id) {
		//this关键字表示当前对象
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.equals("毛泽东") || name.equals("习近平")) {
			System.err.println("no zuo no die!");
			return;
		}
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		//set方法可以进行参数有效性的判断
		if (age < 0 || age > 150) {
			System.err.println("对不起,年龄不合法!");
			return;
		}
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
