package de.telrun.khakov.rustam.homework6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Rustam Khakov
 */
public class ReverseOrder {
	public static void main(String[] args) {
		//2. Задан список фамилий брокеров товарной биржи из N человек.
		// Поменяйте местами фамилии брокеров: первого и последнего, второго и предпоследнего, третьего от начала и третьего от конца и т.д.
		int[] array = new int[]{1, 2, 3, 6, 132, 54, 33, 23, 11};
		List<String> names = Arrays.asList("first", "second", "third", "fourth");
		for (int i = 0; i < names.size() / 2; i++) {
			String temp = names.get(i);
			names.set(i, names.get(names.size() - i - 1));
			names.set(names.size() - i - 1, temp);
		}
		System.out.println(names);
	}
}
