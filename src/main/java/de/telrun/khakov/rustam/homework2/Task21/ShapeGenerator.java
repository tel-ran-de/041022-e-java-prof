package de.telrun.khakov.rustam.homework2.Task21;

import de.telrun.khakov.rustam.homework2.Circle;
import de.telrun.khakov.rustam.homework2.Dot;
import de.telrun.khakov.rustam.homework2.Shape;
import de.telrun.khakov.rustam.homework2.Square;
import de.telrun.khakov.rustam.homework2.Triangle;

import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class ShapeGenerator {
	Shape generate(int res) {
		return switch (res) {
			case 0 -> new Circle("Красный", 2, 1);
			case 1 -> new Square(2, "Черный", 1);
			case 2 -> new Triangle(2, "Черный", 3, 4, 5);
			default -> new Dot();
		};
	}

	public static void main(String[] args) {
		Random random = new Random();
		ShapeGenerator generator = new ShapeGenerator();
		Shape figure = generator.generate(random.nextInt(4));
		Shape figure2 = generator.generate(random.nextInt(4));
		figure.draw();
		figure2.draw();


	}
}
