package de.telrun.khakov.rustam.homework4.atm;

import de.telrun.khakov.rustam.homework2.card.CreditCard;

/**
 * @author Rustam Khakov
 */
public class TestAtm {
	public static void main(String[] args) {
		Atm atm = new SimpleAtm(1000, "fake");
		CreditCard card = new CreditCard("1321421", 1234);
		atm.deposit(card, 1234, 100);
	}
}
