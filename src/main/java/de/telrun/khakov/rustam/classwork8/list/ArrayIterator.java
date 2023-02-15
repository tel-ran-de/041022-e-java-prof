package de.telrun.khakov.rustam.classwork8.list;

import java.util.Iterator;

/**
 * @author Rustam Khakov
 */
public class ArrayIterator implements Iterator<Integer> {
	private Integer[] array;
	int currentIndex;

	public ArrayIterator(Integer[] array) {
		this.array = array;
		currentIndex = 0;
	}

	@Override
	public boolean hasNext() {
		return currentIndex < array.length;
	}

	@Override
	public Integer next() {
		Integer current = array[currentIndex];
		currentIndex++;
		return current;
	}
}
