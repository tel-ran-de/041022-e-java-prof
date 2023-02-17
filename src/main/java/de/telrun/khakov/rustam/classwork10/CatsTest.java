package de.telrun.khakov.rustam.classwork10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/**
 * @author Rustam Khakov
 */
public class CatsTest {
	public static void main(String[] args) {
		List<Cat> cats = new ArrayList<>();
		cats.add(new Cat("Барсик", 2010,3));
		cats.add(new Cat("Барсик", 2015,4));
		cats.add(new Cat("Барсик", 2015,3));
		cats.add(new Cat("Матроскин", 2012,3));
		cats.add(new Cat("Шарик", 2015,3));
		cats.add(null);
		Collections.sort(cats, new CatsYearComparator().reversed());
		System.out.println(cats);
		// сначала сортируй по году, потом сортируй по имени, потом сортируй по весу
		Comparator<Cat> customComparator =
				new CatsYearComparator().reversed()
				.thenComparing(new CatsNameComparator())
				.thenComparing(new CatsWeightComparator());

		Collections.sort(cats, customComparator);
		System.out.println(cats);

		TreeSet<Cat> treeSet = new TreeSet<>();
		treeSet.addAll(cats);
		System.out.println(treeSet);


		List<String> strings = Arrays.asList("test", "test2", "hi", "in", "oop", "dry");
		Collections.sort(strings);
		System.out.println(strings);
	}
}
