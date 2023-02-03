package de.telrun.khakov.rustam.homework4.game;

/**
 * @author Rustam Khakov
 */
public final class Card {
	private final Rank rank;
	private final Suit suit;

	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public Rank getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}

	@Override
	public String toString() {
		return "Card{" +
				"rank=" + rank +
				", suit=" + suit +
				'}';
	}
}
