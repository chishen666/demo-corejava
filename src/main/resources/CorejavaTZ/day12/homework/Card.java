package com.corejava.day12.homework;

/**卡片实体类*/
public class Card {
	private Suit suit;//花色
	private Rank rank;//点数

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
		builder.append("花色:").append(suit).append("\t点数:").append(rank);
		return builder.toString();
	}
}
