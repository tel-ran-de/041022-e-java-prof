package de.telrun.khakov.rustam.homework10;

import java.util.Comparator;

/**
 * @author Rustam Khakov
 */
public class AuthorComparator implements Comparator<Book> {
	@Override
	public int compare(Book o1, Book o2) {
		return o1.getAuthor().compareTo(o2.getAuthor());
	}
}
