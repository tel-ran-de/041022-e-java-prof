package de.telrun.khakov.rustam.classwork2;

/**
 * @author Rustam Khakov
 */
public class TestShapes {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.color = "Зеленый";
		circle.radius = 2;
		circle.setSize(3);
		Triangle triangle = new Triangle();
		triangle.color = "Красный";
		triangle.setSize(5);
		triangle.firstSide = 4;
		triangle.secondSide = 5;
		triangle.thirdSide = 3;
		Square square = new Square();
		square.color = "Желтый";
		square.setSize(7);
		square.width = 4;

		Circle simpleCircle = new Circle("Зеленый", 2, 3);
		Square simpleSquare = new Square(7, "Yellow", 4);
		Triangle simpleTriangle = new Triangle(5, "Red", 5,4,3);


		System.out.println(circle);
		System.out.println(triangle);
		System.out.println(square);

		System.out.println(simpleCircle);
		System.out.println(simpleSquare);
		System.out.println(simpleTriangle);

		System.out.println(circle instanceof Object);
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Dot);

		circle.draw();
		triangle.draw();
		square.draw();
		Dot dot = new Dot();
		dot.draw();


		Shape.sayShape();



	}
}
