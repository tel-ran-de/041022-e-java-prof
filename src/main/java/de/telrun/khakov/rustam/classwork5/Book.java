package de.telrun.khakov.rustam.classwork5;

import java.util.Objects;

/**
 * @author Rustam Khakov
 */
public class Book {
	private String name;
	private String author;

	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Book book = (Book) o;
		return Objects.equals(name, book.name) && Objects.equals(author, book.author);
	}

}
