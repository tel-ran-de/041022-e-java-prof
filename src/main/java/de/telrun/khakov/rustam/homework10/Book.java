package de.telrun.khakov.rustam.homework10;

/**
 * @author Rustam Khakov
 */
public class Book {
	private Author author;
	private String name;
	private int publicationYear;
	private PublishHome publishHome;

	public Author getAuthor() {
		return author;
	}

	public String getName() {
		return name;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public PublishHome getPublishHome() {
		return publishHome;
	}
}
