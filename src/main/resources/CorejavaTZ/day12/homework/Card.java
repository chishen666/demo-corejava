package com.corejava.day12.homework;

/**��Ƭʵ����*/
public class Card {
	private Suit suit;//��ɫ
	private Rank rank;//����

	public Card() {

	}

	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("��ɫ:").append(suit).append("\t����:").append(rank);
		return builder.toString();
	}
}
