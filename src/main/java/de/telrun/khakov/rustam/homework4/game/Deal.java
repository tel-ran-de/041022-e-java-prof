package de.telrun.khakov.rustam.homework4.game;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class Deal {

	private Deck deck;

	public Deal(Deck deck) {
		this.deck = deck;
	}

	public Deck getDeck() {
		return deck;
	}

	public void deal(int players, int cardsForPlayer) {
		// the shuffled deck is displayed
		Card[] cards = deck.getCards();
		for (int i = 0; i < players * cardsForPlayer; i++) {
			System.out.println(cards[i]);
			if (i % cardsForPlayer == cardsForPlayer - 1)
				System.out.println();
		}
	}

	public static void main(String[] args) {

		int cardsForPlayer = 5;
		// deck initialization
		Deck deck = new Deck();
		// deck shuffling
		deck.shuffle();

		Deal deal = new Deal(deck);
		Game game = new Game(deal);
		game.start(cardsForPlayer);
		// the shuffled deck is displayed

	}
}
