package de.telrun.khakov.rustam.homework2.zoo;

/**
 * @author Rustam Khakov
 */
public class Cow extends Herbivore {

	public Cow() {
	}

	public Cow(String name, String color) {
		super(name, color);
	}

	@Override
	public String voice() {
		return "Myyy";
	}

	@Override
	public void jump(int high) {
		if (high > 3) {
			System.out.println("не могу так высоко прыгать");
			return;
		}
		System.out.println("корова прыгает на" + high);
	}


	public void sayMy(){
		System.out.println("Myay");
	}
	@Override
	public String toString() {
		return "Cow{" +
				"name='" + name + '\'' +
				", color='" + color + '\'' +
				'}';
	}
}
