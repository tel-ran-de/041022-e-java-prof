package de.telrun.khakov.rustam.classwork5;

/**
 * @author Rustam Khakov
 */
public class TestBook {
	public static void main(String[] args) {
		Book book = new Book("Harry Potter", "Rouling");
		Book book2 = new Book("Harry Potter", "Rouling");
		Book book3 = book;
		System.out.println(book == book2);
		System.out.println(book == book);
		System.out.println(book == book3);
		System.out.println(book3 == book2);

		System.out.println(book.equals(book2)); // book == book2


	}
}
