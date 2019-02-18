package com.corejava.day11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 本类用来演示HashSet
 *
 * 作者:JSD1412
 * 时间:2015-1-20 下午2:05:18
 */
public class HashSetDemo {
	public static void main(String[] args) {
		/*Set<String> set = new HashSet<>();
		set.add("奔驰");
		set.add("宝马");
		set.add("奥迪");
		set.add("奔驰");
		//无序不可重复

		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String car = iter.next();
			System.out.println(car);
		}*/

		Set<Player> players = new HashSet<>();

		Player p1 = new Player("A", 10);
		Player p2 = new Player("B", 20);
		Player p3 = new Player("A", 10);
		Player p4 = new Player("D", 25);

		players.add(p1);
		players.add(p2);
		players.add(p3);
		players.add(p4);

		Iterator<Player> iter = players.iterator();
		while (iter.hasNext()) {
			Player p = iter.next();
			System.out.println(p);
		}
	}
}
