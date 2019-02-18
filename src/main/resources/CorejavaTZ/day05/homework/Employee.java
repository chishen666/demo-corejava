package com.corejava.day05.homework;

import java.util.Arrays;

/**员工实体类 -- 自关联*/
public class Employee {
	//属性
	private int id;//编号
	private String name;//姓名
	private double salary;//工资

	//private Employee manager;//上司

	private Employee[] employees;//下属数组

	public Employee() {

	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee(int id, String name, double salary, Employee[] employees) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.employees = employees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	//添加下属的方法
	public void addEmp(Employee employee) {
		//判断被添加的员工是否是经理
		if (employees != null) {
			//把原数组长度扩容1个单位并且覆盖
			employees = Arrays.copyOf(employees, employees.length + 1);
			employees[employees.length - 1] = employee;
		} else {
			//如果没有容器,说明该员工是下属,则无权添加
			System.out.println("该员工无权添加下属...");
		}
	}

	//输出自己所属下属的方法
	public void printEmp() {
		//判断当前员工是上司还是下属
		if (employees != null) {
			if (employees.length != 0) {
				for (Employee e : employees) {
					System.out.println("员工编号:" + e.id + ",员工姓名:" + e.name
							+ ",员工工资:" + e.salary);
				}
			} else {
				System.out.println("该上司暂无下属信息...");
			}
		} else {
			System.out.println("该员工是下属...");
		}
	}

	//获取自己下属的人数个数
	public void empCount() {
		if (employees != null) {
			System.out.println("下属人数为:" + employees.length);
		} else {
			System.out.println("该员工是下属...");
		}
	}
}
