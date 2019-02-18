package com.corejava.day11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 本类用来演示HashMap集合
 *
 * 作者:JSD1412
 * 时间:2015-1-21 上午9:21:50
 */
public class HashMapDemo {
	public static void main(String[] args) {
		//创建一个Map集合
		Map<Integer, String> map = new HashMap<>();
		//添加元素
		map.put(2, "one");
		map.put(1, "one");
		map.put(4, "four");
		map.put(1, "one-again");
		map.put(3, "one");
		//针对KEY值无序不可重复,value可以重复
		//注意:相同KEY值后一个元素会把前一个元素的value覆盖!!!

		//判断Map集合是否包含指定KEY或者VALUE
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("one"));

		//通过KEY获取VALUE
		System.out.println(map.get(1));
		
		//把Map中所有的value取出
		Collection<String> values = map.values();
		System.out.println(values);
		

		//遍历
		//1.直接打印
		System.out.println(map);

		//2.keySet()方式遍历
		//a.把Map集合中所有的key值取出来放入到一个Set集合中
		Set<Integer> keys = map.keySet();
		//b.遍历keys集合
		Iterator<Integer> iter1 = keys.iterator();
		while (iter1.hasNext()) {
			//c.获取所有的key值
			Integer key = iter1.next();
			//d.通过key获取value
			String value = map.get(key);
			System.out.println(key + " <===> " + value);
		}

		//3.entrySet()方法遍历
		//a.把Map集合中所有的键值对封装成一个Entry对象,并且放入到Set集合中
		Set<Entry<Integer, String>> entrys = map.entrySet();
		//b.遍历Set集合
		Iterator<Entry<Integer, String>> iter2 = entrys.iterator();
		while (iter2.hasNext()) {
			//c.获取每一个封装的键值对对象
			Entry<Integer, String> entry = iter2.next();
			//d.通过Entry对象中的getXXX()方法来获取KEY,VALUE
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " <===> " + value);
		}
	}
}
