package com.corejava.day06;

import java.util.Arrays;

//业务类
public class EmployeeService {
	//添加下属的方法
	public void addEmp(Employee manager, Employee employee) {
		//判断被添加的员工是否是经理
		if (manager.getEmployees() != null) {
			manager.setEmployees(Arrays.copyOf(manager.getEmployees(),
					manager.getEmployees().length + 1));
			manager.getEmployees()[manager.getEmployees().length - 1] = employee;
		} else {
			//如果没有容器,说明该员工是下属,则无权添加
			System.out.println("该员工无权添加下属...");
		}
	}

	//输出自己所属下属的方法
	public void printEmp(Employee employee) {
		Employee[] employees = employee.getEmployees();
		//判断当前员工是上司还是下属
		if (employees != null) {
			if (employees.length != 0) {
				for (Employee e : employees) {
					System.out.println("员工编号:" + e.getId() + ",员工姓名:"
							+ e.getName() + ",员工工资:" + e.getSalary());
				}
			} else {
				System.out.println("该上司暂无下属信息...");
			}
		} else {
			System.out.println("该员工是下属...");
		}
	}

	//获取自己下属的人数个数
	public void empCount(Employee employee) {
		if (employee.getEmployees() != null) {
			System.out.println("下属人数为:" + employee.getEmployees().length);
		} else {
			System.out.println("该员工是下属...");
		}
	}
}
