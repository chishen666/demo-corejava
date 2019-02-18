package com.corejava.day07;

import com.corejava.day06.homework.Employee;
import static com.corejava.day07.EmployeeFactory.*;

public class TestEmployee {
	public static void main(String[] args) {
		
		Employee employee = EmployeeFactory.getInstance(HOURLY_EMPLOYEE);
	}
}
