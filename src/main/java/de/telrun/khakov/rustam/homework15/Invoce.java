package de.telrun.khakov.rustam.homework15;

import de.telrun.khakov.rustam.classwork3.Person;

/**
 * @author Rustam Khakov
 */
public class Invoce {
	private final Person person;
	private final Bill bill;
	public Invoce(Person person, Bill bill) throws CloneNotSupportedException {
		this.person = person.clone();
		this.bill = bill;
	}
}
