package de.telrun.khakov.rustam.classwork9;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rustam Khakov
 */
public class ArrayListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(20);
		for (int i = 0; i < 20; i++) { // 10 -> 15 -> 22
			list.add("Test");
		}
		System.out.println(list);
	}
}
