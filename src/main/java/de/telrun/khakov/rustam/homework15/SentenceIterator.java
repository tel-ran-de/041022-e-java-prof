package de.telrun.khakov.rustam.homework15;

import java.util.Iterator;

/**
 * @author Rustam Khakov
 */
public class SentenceIterator implements Iterator<String> {
	private String[] words;
	private int currentIndex;

	public SentenceIterator(String sentence) {
		words = sentence.split(" ");
	}

	@Override
	public boolean hasNext() {
		return currentIndex < words.length;
	}

	@Override
	public String next() {
		return words[currentIndex++];
	}
}
