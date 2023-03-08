package de.telrun.khakov.rustam.classswotk15;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Rustam Khakov
 */
public final class Key {
	private final int numberOfLibrary;
	private final int bookIndex;

	private final List<String> labels;

	public Key(int numberOfLibrary, int bookIndex, List<String> labels) {
		this.numberOfLibrary = numberOfLibrary;
		this.bookIndex = bookIndex;
		this.labels = new ArrayList<>(labels);
	}

	public int getNumberOfLibrary() {
		return numberOfLibrary;
	}


	public int getBookIndex() {
		return bookIndex;
	}

	public List<String> getLabels() {
		return new ArrayList<>(labels);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Key key = (Key) o;
		return numberOfLibrary == key.numberOfLibrary && bookIndex == key.bookIndex && Objects.equals(labels, key.labels);
	}

	@Override
	public int hashCode() {
		return Objects.hash(numberOfLibrary, bookIndex, labels);
	}
}
