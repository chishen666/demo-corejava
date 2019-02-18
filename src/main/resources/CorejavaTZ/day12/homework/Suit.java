package com.corejava.day12.homework;

/**花色*/
public enum Suit {
	HEARTS("红心"), SPADES("黑桃"), DIAMONDS("方块"), CLUBS("梅花");

	private String str;

	private Suit(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return str;
	}
}
