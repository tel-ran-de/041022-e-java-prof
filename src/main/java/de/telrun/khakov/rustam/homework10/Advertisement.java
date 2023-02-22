package de.telrun.khakov.rustam.homework10;

/**
 * @author Rustam Khakov
 */
public class Advertisement {
	private int price;
	private String name;
	private String description;
	private String author;
	private int publicationYear;

	public Advertisement(int price,
						 String name,
						 String description,
						 String author,
						 int publicationYear) {
		this.price = price;
		this.name = name;
		this.description = description;
		this.author = author;
		this.publicationYear = publicationYear;
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getAuthor() {
		return author;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	@Override
	public String toString() {
		return "Advertisement{" +
				"price=" + price +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", author='" + author + '\'' +
				", publicationYear=" + publicationYear +
				'}';
	}
}
