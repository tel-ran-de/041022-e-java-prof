package de.telrun.khakov.rustam.homework10;

/**
 * @author Rustam Khakov
 */
public class Author implements Comparable<Author> {
	private String name;

	@Override
	public int compareTo(Author o) {
		return this.name.compareTo(o.name);
	}
}
