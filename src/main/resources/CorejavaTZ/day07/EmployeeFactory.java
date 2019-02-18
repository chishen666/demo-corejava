package com.corejava.day07;

import com.corejava.day06.homework.BasedPlusSalesEmployee;
import com.corejava.day06.homework.Employee;
import com.corejava.day06.homework.HourlyEmployee;
import com.corejava.day06.homework.SalariedEmployee;
import com.corejava.day06.homework.SalesEmployee;

/**员工工厂类--负责创建不同的员工*/
public class EmployeeFactory {

	public static final int SALARIED_EMPLOYEE = 1;
	public static final int HOURLY_EMPLOYEE = 2;
	public static final int SALES_EMPLOYEE = 3;
	public static final int BASED_PLUSSALES_EMPLOYEE = 4;

	public static Employee getInstance(int type) {
		Employee employee = null;
		switch (type) {
		case SALARIED_EMPLOYEE:
			employee = new SalariedEmployee();
			break;
		case HOURLY_EMPLOYEE:
			employee = new HourlyEmployee();
			break;
		case SALES_EMPLOYEE:
			employee = new SalesEmployee();
			break;
		case BASED_PLUSSALES_EMPLOYEE:
			employee = new BasedPlusSalesEmployee();
			break;
		default:
			System.out.println("对不起,参数不合法!");
		}
		return employee;
	}
}
