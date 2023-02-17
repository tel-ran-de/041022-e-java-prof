package de.telrun.khakov.rustam.classwork10;

import java.util.Comparator;

/**
 * @author Rustam Khakov
 */
public class CatsYearComparator implements Comparator<Cat> {
	@Override
	public int compare(Cat o1, Cat o2) {
		if (o1.getBirthYear() == o2.getBirthYear()) {
			return 0;
		}
		if (o1.getBirthYear() < o2.getBirthYear()) {
			return -1;
		}
		return 1;
	}
}
