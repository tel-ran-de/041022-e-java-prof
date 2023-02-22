package de.telrun.khakov.rustam.homework10;

import java.util.Comparator;

/**
 * @author Rustam Khakov
 */
public class NameComparator implements Comparator<Advertisement> {
	@Override
	public int compare(Advertisement o1, Advertisement o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
