package de.telrun.khakov.rustam.classwork7;

import java.util.Iterator;

/**
 * @author Rustam Khakov
 */
public class BookTest {

	public static void main(String[] args) {
		Book book = new MangaBook();
		book.addSheet("Harry Potter part 1");
		book.addSheet("List data");
		book.addSheet("Part 1");
		book.addSheet("Part 2");
		book.addSheet("Part 3");
		book.addSheet("The end");

		for (Sheet sheet : book) {
			System.out.println(sheet);
		}

		for (int i = book.sheets.size() - 1; i >= 0; i--) {
			System.out.println(book.sheets.get(i));
		}

		int currentIndex = book.sheets.size() - 1;//new Iterator(..)
		while (currentIndex >= 0) {//iterator.hasNext()
			Sheet sheet = book.sheets.get(currentIndex);//iterator.next()
			currentIndex--;//
			System.out.println(sheet);
		}

		Iterator<Sheet> iterator = book.iterator();//book.sheets.size() -1
		while (iterator.hasNext()) { // i>=0
			System.out.println(iterator.next());//book.sheets.get(i); i--
		}

	}
}
