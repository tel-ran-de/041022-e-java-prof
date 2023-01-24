package de.telrun.khakov.rustam.homework2.zoo;

/**
 * @author Rustam Khakov
 */
public abstract class Predator extends Animal {
	public Predator() {
	}

	public Predator(String name, String color) {
		super(name, color);
	}

	@Override
	public void eat(String food) {
		System.out.println("я ем все");
	}
}
