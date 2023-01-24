package de.telrun.khakov.rustam.homework2.zoo;

/**
 * @author Rustam Khakov
 */
public abstract class Herbivore extends Animal {

	public Herbivore() {
	}

	public Herbivore(String name, String color) {
		super(name, color);
	}

	@Override
	public void eat(String food) {
		if ("meat".equals(food)) {
			System.out.println("я такое не ем");
		} else {
			System.out.println("я кушаю");
		}
	}
}
