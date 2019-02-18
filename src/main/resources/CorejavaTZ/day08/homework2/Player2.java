package com.corejava.day08.homework2;

public class Player2 implements Player {

	@Override
	public String getName() {
		return "Rose";
	}

	@Override
	public String show() {
		String str = null;
		int random = (int) (Math.random() * 3);
		if (random == 0) {
			str = BU;
		} else if (random == 1) {
			str = JIANDAO;
		} else {
			str = SHITOU;
		}
		return str;
	}
}