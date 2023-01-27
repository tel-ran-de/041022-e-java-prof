package de.telrun.khakov.rustam.homework2;

/**
 * @author Rustam Khakov
 */
public class Cube extends Shape3D {

	private int width;

	public Cube(int width) {
		this.width = width;
	}

	@Override
	public void draw() {

	}

	@Override
	public double calculateArea() {
		return 6 * width * width;
	}

	@Override
	public double calculatePerimeter() {
		return 12 * width;
	}

	@Override
	void volume() {
		System.out.println(width * width * width);
	}
}
