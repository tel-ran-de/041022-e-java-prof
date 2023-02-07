package de.telrun.khakov.rustam.classwork7;

import java.util.Iterator;

/**
 * @author Rustam Khakov
 */
public class MangaBook extends Book {

	public MangaBook() {
	}

	@Override
	public Iterator<Sheet> iterator() {
		return new ReverseIterator(sheets);
	}
}
