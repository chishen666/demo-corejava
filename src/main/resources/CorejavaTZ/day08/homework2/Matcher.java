package com.corejava.day08.homework2;

public class Matcher {
	/**
	 * ��������ɵ�ҵ����:
	 * ģ��������һ����ȭ,����show�����ֱ��ȡ��ҵĳ�ȭ,����˭��˭Ӯ.
	 */
	public static void match(Player p1, Player p2) {
		String s1 = p1.show();
		String s2 = p2.show();
		String n1 = p1.getName();
		String n2 = p2.getName();

		if (s1.equals(s2)) {
			System.out
					.println(n1 + "����" + s1 + "," + n2 + "����" + s2 + ",���ƽ��.");
		} else if ((s1.equals(Player.BU) && s2.equals(Player.SHITOU))
				|| (s1.equals(Player.SHITOU) && s2.equals(Player.JIANDAO))
				|| (s1.equals(Player.JIANDAO) && s2.equals(Player.BU))) {
			System.out.println(n1 + "����" + s1 + "," + n2 + "����" + s2 + "," + n1
					+ "Ӯ��.");
		} else {
			System.out.println(n1 + "����" + s1 + "," + n2 + "����" + s2 + "," + n2
					+ "Ӯ��.");
		}
	}
}