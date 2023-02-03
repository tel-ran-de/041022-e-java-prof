package de.telrun.khakov.rustam.homework4.game;

import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class Game {

	private Deal deal;

	public Game(Deal deal) {
		this.deal = deal;
	}

	void start(int cardsForPlayer) {
		int players = getPlayers(cardsForPlayer);
		deal.deal(players, cardsForPlayer);
	}

	private int getPlayers(int cardsForPlayer) {
		final Scanner sc = new Scanner(System.in);
		int players;
		int numberOfCards = deal.getDeck().cards.length;
		while (true) {
			System.out.println("Enter the number of players: ");

			if (sc.hasNextInt()) {
				players = sc.nextInt();
				if (cardsForPlayer * players <= numberOfCards) {
					break;
				} else {
					if (players == 0) {
						System.out.println("The game has been terminated.");
						break;
					} else if (players < 0) {
						System.out.println("The number of players cannot be less than 0");
					} else {
						System.out.println("Too many players!");
					}
				}
			} else {
				System.out.println("You have not entered a number, or your number is too large!");
			}
		}
		return players;
	}

}
