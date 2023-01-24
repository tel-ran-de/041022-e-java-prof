package de.telrun.khakov.rustam.classwork3;

/**
 * @author Rustam Khakov
 */
public class Person implements Jumpable {
	@Override
	public void jump() {
		System.out.println("я могу прыгать");
	}

	@Override
	public void jump(int high) {
		System.out.println("я могу прыгать на высоту " + high);
	}
}
