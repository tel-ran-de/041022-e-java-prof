package de.telrun.khakov.rustam.homework15;

import java.util.Iterator;

/**
 * @author Rustam Khakov
 */
public class WordSymbolsIterator implements Iterator<Character> {
	Iterator<String> sentenceIterator;
	Iterator<Character> wordIterator;

	public WordSymbolsIterator(String sentence) {
		sentenceIterator = new SentenceIterator(sentence);
		wordIterator = new WordIterator(sentenceIterator.next());
	}

	@Override
	public boolean hasNext() {
		return sentenceIterator.hasNext() || wordIterator.hasNext();
	}

	@Override
	public Character next() {
		if (!wordIterator.hasNext() && sentenceIterator.hasNext()) {
			String word = sentenceIterator.next();
			wordIterator = new WordIterator(word);
		}
		if (wordIterator.hasNext()) {
			return wordIterator.next();
		}
		return null;
	}
}
