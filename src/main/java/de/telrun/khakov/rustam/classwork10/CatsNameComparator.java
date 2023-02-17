package de.telrun.khakov.rustam.classwork10;

import java.util.Comparator;

/**
 * @author Rustam Khakov
 */
public class CatsNameComparator implements Comparator<Cat> {
	@Override
	public int compare(Cat o1, Cat o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
