package com.corejava.day12.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**�˿���*/
public class Poker {
	private List<Card> cards = new ArrayList<>();

	//���췽�������Ը�ֵ
	public Poker() {
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				Card c = new Card(s, r);
				cards.add(c);
			}
		}
	}
	
	/**ϴ��*/
	public void shuffle(){
		Collections.shuffle(cards);
	}

	public void showCards() {
		shuffle();
		for (int i = 0; i < cards.size(); i++) {
			System.out.println(cards.get(i));
		}
	}

	public static void main(String[] args) {
		Poker p = new Poker();
		p.showCards();
	}
}
