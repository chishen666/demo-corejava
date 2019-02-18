package com.corejava.day12;

import java.util.ArrayList;
import java.util.List;

import com.corejava.day10.Student;

/**
 * 本类用来演示Java集合构建的细节问题
 *
 * 作者:JSD1412
 * 时间:2015-1-21 下午1:44:53
 */
public class ListDetilDemo {
	public static void main(String[] args) {
		List<Student> list1 = new ArrayList<>();
		list1.add(new Student(100, "Tom"));
		list1.add(new Student(101, "Jack"));
		list1.add(new Student(102, "Marry"));
		list1.add(new Student(103, "Rose"));
		List<Student> list2 = new ArrayList<>(list1);
		
		//非结构性修改,修改元素本身,会对另一个集合产生影响的
		//list1.get(0).setName("Ann"); 
		
		//结构性修改,修改集合结构,不会对另一个集合产生影响.
		//add,remove,sort...
		list1.remove(2);
		
		System.out.println(list2);
		
		System.out.println("-----------------");
		
		List<Integer> list3 = new ArrayList<>();
		list3.add(100);
		list3.add(200);
		list3.add(300);
		list3.add(400);
		List<Integer> list4 = new ArrayList<>(list3);
		
		list3.set(0, 888);
		
		System.out.println(list4);
		
		
	}
}
