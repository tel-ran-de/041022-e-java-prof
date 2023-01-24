package de.telrun.khakov.rustam.homework2.zoo;

/**
 * @author Rustam Khakov
 */
public class Lamb extends Herbivore {

	public Lamb() {
	}

	public Lamb(String name, String color) {
		super(name, color);
	}

	@Override
	public String voice() {
		return "Beee";
	}

	@Override
	public void jump(int high) {
		if (high > 2) {
			System.out.println("не могу так высоко прыгать");
			return;
		}
		System.out.println("овечка прыгает на" + high);
	}

	@Override
	public String toString() {
		return "Lamb{" +
				"name='" + name + '\'' +
				", color='" + color + '\'' +
				'}';
	}
}
