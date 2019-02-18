package com.corejava.day05;

import java.util.Arrays;

/**学生实体类*/
public class Student {
	//属性
	private int id;
	private String name;
	private String[] courses;//课程数组属性

	private Clazz clazz;//学生所在的班级

	public Student() {

	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Student(int id, String name, String[] courses, Clazz clazz) {
		this.id = id;
		this.name = name;
		this.courses = courses;
		this.clazz = clazz;
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

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	/**
	 * 打印学生所有信息
	 */
	public String printStudentInfo() {
		String message = "学号:" + id + ",姓名:" + name;
		if (courses != null) {
			message += ",所选课程:" + Arrays.toString(courses);
		}
		if (clazz != null) {
			message += clazz.printClazzInfo();
		}
		return message;
	}
}
