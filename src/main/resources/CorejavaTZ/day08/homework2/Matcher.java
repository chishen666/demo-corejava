package com.corejava.day08.homework2;

public class Matcher {
	/**
	 * 本方法完成的业务是:
	 * 模拟两个玩家互相猜拳,调有show方法分别获取玩家的出拳,决定谁负谁赢.
	 */
	public static void match(Player p1, Player p2) {
		String s1 = p1.show();
		String s2 = p2.show();
		String n1 = p1.getName();
		String n2 = p2.getName();

		if (s1.equals(s2)) {
			System.out
					.println(n1 + "出了" + s1 + "," + n2 + "出了" + s2 + ",打成平手.");
		} else if ((s1.equals(Player.BU) && s2.equals(Player.SHITOU))
				|| (s1.equals(Player.SHITOU) && s2.equals(Player.JIANDAO))
				|| (s1.equals(Player.JIANDAO) && s2.equals(Player.BU))) {
			System.out.println(n1 + "出了" + s1 + "," + n2 + "出了" + s2 + "," + n1
					+ "赢了.");
		} else {
			System.out.println(n1 + "出了" + s1 + "," + n2 + "出了" + s2 + "," + n2
					+ "赢了.");
		}
	}
}