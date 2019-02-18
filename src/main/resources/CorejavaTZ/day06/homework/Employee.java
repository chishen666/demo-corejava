package com.corejava.day06.homework;

import java.util.Calendar;
import java.util.Date;

import com.corejava.util.DateUtil;

/**员工父类*/
public class Employee {
	private String name;
	private Date birthday;

	public Employee() {

	}

	public Employee(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public double getSalary(int month) {
		return 0.0;
	}

	public final double isBirthdayMonth(int month) {
		double salary = 0.0;
		Calendar cal = Calendar.getInstance();
		cal.setTime(getBirthday());
		if (cal.get(Calendar.MONTH) + 1 == month) {
			salary += 100;
		}
		return salary;
	}

	@Override
	public String toString() {
		return "员工,姓名:" + name + ",生日:"
				+ DateUtil.formateDate(birthday, "yyyy-MM-dd");
	}
}
