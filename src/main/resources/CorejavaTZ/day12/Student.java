package com.corejava.day12;

/**学生实体类*/
public class Student {
	private int id;
	private String name;
	private Gender gender;//枚举属性

	public Student(int id, String name, Gender gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public static void main(String[] args) {
		Student s = new Student(100, "Ann", Gender.FEMALE);
		
		//获取枚举常量的名称
		System.out.println(s.getGender().name());
	}
}
