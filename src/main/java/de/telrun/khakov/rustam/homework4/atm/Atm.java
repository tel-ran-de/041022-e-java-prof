package de.telrun.khakov.rustam.homework4.atm;

import de.telrun.khakov.rustam.homework2.card.CreditCard;

/**
 * @author Rustam Khakov
 */
public abstract class Atm {
	protected double sum;
	protected String model;

	public Atm(double sum, String model) {
		this.sum = sum;
		this.model = model;
	}

	public abstract void doOperation(int operationNumber, CreditCard card);

	public abstract void deposit(CreditCard card, int pin, int sum);

	public abstract void withdraw(CreditCard card, int pin, int sum);


}
