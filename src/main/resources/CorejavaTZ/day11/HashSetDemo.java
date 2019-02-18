package com.corejava.day11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ����������ʾHashSet
 *
 * ����:JSD1412
 * ʱ��:2015-1-20 ����2:05:18
 */
public class HashSetDemo {
	public static void main(String[] args) {
		/*Set<String> set = new HashSet<>();
		set.add("����");
		set.add("����");
		set.add("�µ�");
		set.add("����");
		//���򲻿��ظ�

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
