package de.telrun.khakov.rustam.classwork3;

/**
 * @author Rustam Khakov
 */
public class Person implements Jumpable, Cloneable{
	@Override
	public void jump() {
		System.out.println("я могу прыгать");
	}

	@Override
	public void jump(int high) {
		System.out.println("я могу прыгать на высоту " + high);
	}

	@Override
	public Person clone() throws CloneNotSupportedException {
		return (Person) super.clone();
	}
}
