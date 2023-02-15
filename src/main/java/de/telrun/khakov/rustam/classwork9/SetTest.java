package de.telrun.khakov.rustam.classwork9;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * @author Rustam Khakov
 */
public class SetTest {
	public static void main(String[] args) {
		NavigableSet<String> set = new TreeSet<>();
		ConcurrentSkipListSet<String> str = new ConcurrentSkipListSet<>();
		set.add("Test");
		set.add("Sort");
		set.add("Plan");
		set.add("High");
		set.add("Less");
		set.add("Charge");
		set.add("Charge11");
		set.add("Char");
		//set.add(null);
		System.out.println(set.headSet("High"));
		System.out.println(set.tailSet("High"));
		System.out.println(set);


		System.out.println(set.higher("Charge"));
		System.out.println(set.floor("Charge"));
		System.out.println(set.lower("Charge"));
		System.out.println(set.ceiling("Charge"));

	}
}
