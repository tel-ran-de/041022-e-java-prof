package de.telrun.khakov.rustam.classwork10;

import java.util.Comparator;

/**
 * @author Rustam Khakov
 */
public class CatsWeightComparator implements Comparator<Cat> {
	@Override
	public int compare(Cat o1, Cat o2) {
		return Integer.compare(o1.getWight(), o2.getWight());
	}
}
