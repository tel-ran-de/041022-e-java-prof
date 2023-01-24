package de.telrun.khakov.rustam.homework2.zoo;

import de.telrun.khakov.rustam.classwork3.Jumpable;

/**
 * @author Rustam Khakov
 */
public abstract class Animal implements Jumpable {
	protected String name;
	protected String color;

	public Animal() {
	}

	public Animal(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public abstract String voice();

	public abstract void eat(String food);

	public void jump() {
		jump(1);
	}
	public abstract void jump(int high);

}
