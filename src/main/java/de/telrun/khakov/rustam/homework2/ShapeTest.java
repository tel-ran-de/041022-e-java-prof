package de.telrun.khakov.rustam.homework2;

/**
 * @author Rustam Khakov
 */
public class ShapeTest {
	public static void main(String[] args) {
		Circle circle = new Circle("Red", 2, 1);
		Triangle triangle = new Triangle(1, "Green", 3, 4,5);
		Square square = new Square(1, "Green", 3);
		System.out.println(circle);
		System.out.println(triangle);
		System.out.println(square);
		System.out.printf("площадь равна %f%n", circle.calculateArea());
		System.out.printf("периметр равен %f%n", circle.calculatePerimeter());
		System.out.printf("площадь равна %f%n", triangle.calculateArea());
		System.out.printf("периметр равен %f%n", triangle.calculatePerimeter());
		System.out.printf("площадь равна %f%n", square.calculateArea());
		System.out.printf("периметр равен %f%n", square.calculatePerimeter());
	}
}
