package de.telrun.khakov.rustam.homework10;

import java.util.Comparator;

/**
 * @author Rustam Khakov
 */
public class PriceComparator implements Comparator<Advertisement> {
	@Override
	public int compare(Advertisement o1, Advertisement o2) {
		return Integer.compare(o1.getPrice(), o2.getPrice());
	}
}
