package de.telrun.khakov.rustam.homework15;

import java.util.Iterator;

/**
 * @author Rustam Khakov
 */
public class IteratorTest {
	public static void main(String[] args) {
		String str = "Мама мыла раму";
		Iterator<Character> wordSymbolsIterator = new WordSymbolsIterator(str);
		while (wordSymbolsIterator.hasNext()) {
			System.out.println(wordSymbolsIterator.next());
		}
	}
}
