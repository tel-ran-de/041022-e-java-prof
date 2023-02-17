package de.telrun.khakov.rustam.classwork10;

import java.util.Comparator;

/**
 * @author Rustam Khakov
 */
public class MixedComparator implements Comparator<Cat> {
	@Override
	public int compare(Cat o1, Cat o2) {
		int yearsCompare = Integer.compare(o1.getBirthYear(), o2.getBirthYear());
		if (yearsCompare == 0) {
			int nameCompare = o1.getName().compareTo(o2.getName());
			if (nameCompare == 0) {
				return Integer.compare(o1.getWight(), o2.getWight());
			}
			return nameCompare;
		}
		return yearsCompare;
		//new CatsYearComparator().thenComparing(new CatsNameComparator()).thenComparing(new CatsWeightComparator());

	}
}
