package com.corejava.day05;

import java.util.Arrays;

/**测试类*/
public class TestStudent {
	public static void main(String[] args) {
		//1.创建一个学号为100,姓名为Ann的学生
		Student s1 = new Student(100, "Ann");

		//修改s1学员的名字,Ben
		s1.setName("Ben");

		//创建一个课程数组
		String[] courses = { "Java", "C++", "PHP" };

		//s1学员选择课程数组
		s1.setCourses(courses);

		//查看s1学员所选三门课的名称
		System.out.println(Arrays.toString(s1.getCourses()));

		//查看s1学员所选课程的第二门是什么课程
		System.out.println(s1.getCourses()[1]);

		//修改s1学员最后一门课程为.NET
		//s1.setCourses(new String[]{"Java","C++",".NET"});

		s1.getCourses()[2] = ".NET";
		System.out.println(Arrays.toString(s1.getCourses()));

		//创建一个班级
		Clazz clazz = new Clazz("JSD1412", 42);

		//让s1学员选择该班级
		s1.setClazz(clazz);

		//获取s1学员所在班级的人数
		System.out.println(s1.getClazz().getClazzCap());

		//修改s1所在班级JSD1413
		s1.getClazz().setClazzName("JSD1413");

		//创建一个全新的全信息学员,200,Jack,"体育,美术,英语","兴趣班 10"
		Student s2 = new Student(200, "Jack",
				new String[] { "体育", "美术", "英语" }, new Clazz("兴趣班", 10));
		
		Student s3 = new Student(101, "OZ");
		
		System.out.println(clazz.printClazzInfo());
		
		System.out.println(s2.printStudentInfo());
		System.out.println(s3.printStudentInfo());

	}
}
