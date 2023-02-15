package de.telrun.khakov.rustam.classwork9;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Rustam Khakov
 */
public class HashSetTest {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		set.add("Test"); //1
		set.add("Test2");//2
		set.add("Test3");//3
		set.add("Test");// -
		set.add("Test4");//4
		set.add("Test5");//5
		set.add("Test33"); //6
		Set<String> hashSet = Set.of("first","test", "petya");

		System.out.println(set);
	}
}
