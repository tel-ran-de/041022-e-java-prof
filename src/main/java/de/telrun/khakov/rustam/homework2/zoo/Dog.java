package de.telrun.khakov.rustam.homework2.zoo;

/**
 * @author Rustam Khakov
 */
public class Dog extends Predator {

	public Dog() {
	}

	public Dog(String name, String color) {
		super(name, color);
	}

	@Override
	public String voice() {
		return "Gav";
	}

	@Override
	public void jump(int high) {
		if (high > 4) {
			System.out.println("не могу так высоко прыгать");
			return;
		}
		System.out.println("собака прыгает на" + high);
	}

	@Override
	public void jump() {
		System.out.println("прыгаю как могу");
	}

	@Override
	public String toString() {
		return "Dog{" +
				"name='" + name + '\'' +
				", color='" + color + '\'' +
				'}';
	}
}
