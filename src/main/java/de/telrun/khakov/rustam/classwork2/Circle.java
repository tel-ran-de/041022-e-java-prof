package de.telrun.khakov.rustam.classwork2;

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
//		System.out.println(this);
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
}
