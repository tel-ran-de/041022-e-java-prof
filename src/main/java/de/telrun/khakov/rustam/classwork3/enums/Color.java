package de.telrun.khakov.rustam.classwork3.enums;

/**
 * @author Rustam Khakov
 */
public enum Color {
	RED(255, 0, 0),
	GREEN(0, 255, 0),
	BLUE(0, 0, 255),
	WHITE(255, 255, 255);


	private int green;
	private int blue;
	private int red;

	Color(int red, int green, int blue) {
		this.green = green;
		this.blue = blue;
		this.red = red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}

	public int getRed() {
		return red;
	}

	public static void main(String[] args) {
		//
	}
}
