package com.corejava.day12.homework;

/**��ɫ*/
public enum Suit {
	HEARTS("����"), SPADES("����"), DIAMONDS("����"), CLUBS("÷��");

	private String str;

	private Suit(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return str;
	}
}
