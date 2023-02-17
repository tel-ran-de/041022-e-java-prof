package de.telrun.khakov.rustam.classwork10;

/**
 * @author Rustam Khakov
 */
public class EqualsTest {
	public static void main(String[] args) {
		String first = "tse";
		String second = "tse";

		Cat cat = new Cat("Барсик");
		Cat cat2 = new Cat("Барсик");
		Cat cat3 = cat;

		System.out.println(cat2.equals(cat));
		System.out.println(cat3.equals(cat));
		System.out.println(cat.equals(cat));
		System.out.println(cat.equals("null"));


		System.out.println(first == second);
	}
}
