package de.telrun.khakov.rustam.homework7;

import java.util.Iterator;

/**
 * @author Rustam Khakov
 */
public class CircleIterator implements Iterator<Integer> {
	private Integer[] array;
	private int currentIndex; // по усолчанию - 0

	public CircleIterator(Integer[] array) {
		this.array = array;
	}
	/// [3, 7, 8, 4]

	@Override
	public boolean hasNext() {
		return true;
	}

	@Override
	public Integer next() {
		Integer current = array[currentIndex];
		if (currentIndex == array.length - 1) {
			currentIndex = 0;
			return current;
		}
		currentIndex++;
		return current;
	}
}
