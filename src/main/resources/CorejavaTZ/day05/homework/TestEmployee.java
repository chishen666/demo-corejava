package com.corejava.day05.homework;

public class TestEmployee {
	public static void main(String[] args) {

		//Employee m = new Employee(100, "Boss", 50000);

		//下属
		Employee e1 = new Employee(1000, "Jack", 3000);
		Employee e2 = new Employee(1001, "Rose", 4000);
		Employee e3 = new Employee(1002, "Ben", 3500);
		Employee e4 = new Employee(1003, "Mary", 5000);

		//上司
		Employee m = new Employee(100, "Boss", 50000, new Employee[] {});
		
		//注意:
		//员工数组为空有两种情况:
		//1.employees == null,容器不存在,此条件如果不判断,可能出现空指针异常
		//2.employees.length == 0,容器存在,但是里面是空的,此条件如果不判断,可能出现数组下标越界
		
		//添加员工
		m.addEmp(e1);
		m.addEmp(e2);
		m.addEmp(e3);
		m.addEmp(e4);
		
		//查看员工
		m.printEmp();
		
		//查看人数
		m.empCount();
	}
}
