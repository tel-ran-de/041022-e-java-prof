package de.telrun.khakov.rustam.homework4.game;

import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class Deck {
	Card[] cards;

	public Deck() {
		Rank[] ranks = Rank.values();
		Suit[] suits = Suit.values();
		int numberOfCards = ranks.length * suits.length;
		cards = new Card[numberOfCards];
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				cards[suits.length * i + j] = new Card(ranks[i], suits[j]);
			}
		}

	}

	public Card[] getCards() {
		return cards;
	}

	public void shuffle(){
		Random random = new Random();
		for (int i = 0; i < cards.length; i++) {
			int card = i + (random.nextInt(cards.length - i)); // random card in the deck
			Card temp = cards[card];
			cards[card] = cards[i];
			cards[i] = temp;
		}
	}
}
