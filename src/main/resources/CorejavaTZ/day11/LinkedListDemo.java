package com.corejava.day11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.corejava.day10.Student;

/**
 * 本类用来演示LinkedList操作对象类型
 *
 * 作者:JSD1412
 * 时间:2015-1-20 上午11:12:57
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		Student s1 = new Student(100, "Jack");
		Student s2 = new Student(101, "Ann");
		Student s3 = new Student(102, "Ben");
		Student s4 = new Student(103, "Cherry");

		//创建一个存放学生的集合
		List<Student> students = new LinkedList<>();

		//添加学生
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);

		//遍历
		Iterator<Student> iter = students.iterator();
		while (iter.hasNext()) {
			Student s = iter.next();
			System.out.println(s);
		}
	}
}
