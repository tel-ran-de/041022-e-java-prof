package de.telrun.khakov.rustam.classwork2;

/**
 * @author Rustam Khakov
 */
public class Square extends Shape {
	int width;

	public Square(int size, String color, int width) {
		super(size, color);
		this.width = width;
	}

	public Square() {
	}

	@Override
	public void draw() {
		System.out.println("Рисую квадрат");
	}

	@Override
	public String toString() {
		return "Square{" +
				"width=" + width +
				", size=" + size +
				", color='" + color + '\'' +
				'}';
	}
}
