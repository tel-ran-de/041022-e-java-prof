package de.telrun.khakov.rustam.homework2;

/**
 * @author Rustam Khakov
 */
public class Circle extends Shape {
	int radius;
	final int testParam;

	public Circle(String color, int radius, int size) {
		super(size, color);
		this.radius = radius;
		this.testParam = 1;
	}

	public Circle() {
		this.testParam = 2;
	}

	public void startDraw(){
		draw();
		printSize();
	}

	@Override
	public void draw() {
		System.out.println("рисую круг");
	}

	@Override
	public final String toString() {
		return "Circle{" +
				"radius=" + radius +
				", size=" + size +
				", color='" + color + '\'' +
				'}';
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;// Math.PI * Math.pow(radius, 2)
	}

	@Override
	public double calculatePerimeter() {
		return Math.PI * 2 * radius;
	}
}
