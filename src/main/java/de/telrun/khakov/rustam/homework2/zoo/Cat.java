package de.telrun.khakov.rustam.homework2.zoo;

/**
 * @author Rustam Khakov
 */
public class Cat extends Predator {

	private int birthday;
	public Cat() {
	}

	public Cat(String name, String color) {
		super(name, color);
	}

	public Cat(String name, String color, int birthday) {
		super(name, color);
		this.birthday = birthday;
	}

	@Override
	public String voice() {
		return "Miyay";
	}

	@Override
	public void jump(int high) {
		System.out.println("кошка прыгает на" + high);
	}

	@Override
	public String toString() {
		return "Cat{" +
				"name='" + name + '\'' +
				", color='" + color + '\'' +
				'}';
	}
}
