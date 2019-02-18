package com.corejava.day06;

public class TestEmployee {
	public static void main(String[] args) {

		//下属
		Employee e1 = new Employee(1000, "Jack", 3000);
		Employee e2 = new Employee(1001, "Rose", 4000);
		Employee e3 = new Employee(1002, "Ben", 3500);
		Employee e4 = new Employee(1003, "Mary", 5000);

		//上司
		Employee m = new Employee(100, "Boss", 50000, new Employee[] {});

		//创建业务类对象
		EmployeeService es = new EmployeeService();

		//添加员工
		es.addEmp(m, e1);
		es.addEmp(m, e2);
		es.addEmp(m, e3);
		es.addEmp(m, e4);
		
		//查看员工
		es.printEmp(m);

		//查看人数
		es.empCount(m);
	}
}
