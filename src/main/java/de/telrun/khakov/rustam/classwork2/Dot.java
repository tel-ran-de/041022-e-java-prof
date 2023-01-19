package de.telrun.khakov.rustam.classwork2;

/**
 * @author Rustam Khakov
 */
public final class Dot extends Circle {


	@Override
	public void draw() {
		System.out.println("рисую точку");
	}

	@Override
	public void draw(String type) {
		System.out.println("Рисую точку в виде " + type);
	}
}
