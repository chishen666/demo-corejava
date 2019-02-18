package com.corejava.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 本类用来演示ArrayList的常用方法
 *
 * 作者:JSD1412
 * 时间:2015-1-20 上午10:33:17
 */
public class ArrayListDemo {
	public static void main(String[] args) {

		//JDK5.0之前,集合存在类型安全问题,其中可以放任何类型的元素
		//ArrayList list = new ArrayList();
		//list.add(100);
		//list.add(true);

		//JDK5.0之后,对整个JCF进行了重写,加入了泛型概念,它的作用就是:
		//用来约束集合的元素类型,避免类型安全问题

		//1.创建默认初始容量为10个容量单位的集合
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(100);
		//list1.add(3.14);//此集合只能存放Integer类型的元素

		//2.创建指定容量的集合
		List<String> list2 = new ArrayList<String>(5);

		//3.根据一个已知的集合构建一个新集合
		List<String> list3 = new ArrayList<String>(list2);

		//JDK7.0时,提供了简化形式
		List<Integer> list4 = new ArrayList<>();

		System.out.println("---------------------------------------");

		List<Integer> list = new ArrayList<>();

		//常用方法:
		//1.添加集合元素
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(3);//有序,可重复

		//2.清空集合元素
		//list.clear();

		//3.判断集合中是否包含指定元素
		boolean b1 = list.contains(3);
		System.out.println(b1);

		//4.通过下标获取集合元素
		//如果下标超过范围,则抛出异常:java.lang.IndexOutOfBoundsException
		System.out.println(list.get(0));

		//5.获取元素第一次出现的下标,如果不存在,则返回-1
		int index1 = list.indexOf(3);
		System.out.println(index1);

		//获取元素最后一次出现的下标,如果不存在,则返回-1
		int index2 = list.lastIndexOf(3);
		System.out.println(index2);

		//6.判断集合元素是否为空
		System.out.println(list.isEmpty());

		//7.删除集合元素
		//a.根据下标删除元素
		//list.remove(2);
		
		//b.根据元素删除(删除首次出现的)
		//boolean b2 = list.remove(new Integer(3));
		
		//8.通过下标修改元素
		list.set(2, 888);
		
		//9.获取集合元素个数
		System.out.println(list.size());
		
		//遍历
		
		//集合迭代的通用方式--集合迭代器迭代
		//a.创建当前集合迭代器
		Iterator<Integer> iter = list.iterator();
		//b.循环迭代
		while(iter.hasNext()){
			//如果存在下一个,则获取
			Integer i = iter.next();
			System.out.println(i);
		}
		
		//1.直接打印
		System.out.println(list);
		
		//2.转换成数组
		Object[] arr = list.toArray();
		System.out.println(Arrays.toString(arr));
		
		//3.普通for循环
		for(int i = 0;i < list.size();i++){
			System.out.println(list.get(i));
		}
		
		//4.增强for循环
		for(Integer i : list){
			System.out.println(i);
		}
	}
}
