package de.telrun.khakov.rustam.classwork2;

/**
 * @author Rustam Khakov
 */
public abstract class Shape {
	protected int size;
	String color;

	public static void sayShape() {
		System.out.println("Shape");
	}

	public Shape(int size, String color) {
		this.size = size;
		this.color = color;
	}

	public Shape() {
//		System.out.println(this);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public abstract void draw();

	public void draw(String type) {
		draw();
	}
	// штриховать, полностью, какой-то другой


	protected void printSize() {
		System.out.printf("size is %d%n", size);
	}
}
