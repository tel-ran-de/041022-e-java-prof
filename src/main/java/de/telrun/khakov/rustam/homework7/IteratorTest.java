package de.telrun.khakov.rustam.homework7;

import java.util.Iterator;

/**
 * @author Rustam Khakov
 */
public class IteratorTest {
	public static void main(String[] args) {
		Integer[] array = new Integer[]{4, 6, 8, 5, 5, 8};
		Iterator<Integer> iterator = new CircleIterator(array);
		while (iterator.hasNext()) {
			iterator.next();
		}

	}
}
