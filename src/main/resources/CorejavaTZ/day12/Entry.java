package com.corejava.day12;

/**
 * ����������ʾ�Զ��巺����
 *
 * ����:JSD1412
 * ʱ��:2015-1-21 ����4:51:30
 */
public class Entry<X, Y, Z> {
	private X x;
	private Y y;
	private Z z;

	public Entry(X x, Y y, Z z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void main(String[] args) {
		Entry<Integer, String, String> e1 = new Entry<>(100, "A", "Jack");
		Entry<String, String, String> e2 = new Entry<>("100", "A", "Jack");
	}
}
