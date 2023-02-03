package de.telrun.khakov.rustam.classwork6;

import de.telrun.khakov.rustam.homework2.card.CreditCard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Rustam Khakov
 */
public class CollectionTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // Object[] array = new Object[10];
		System.out.println(list);
		list.add("yty");
		System.out.println(list);
		list.add("test link");
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.add("test2");
		System.out.println(list);
		list.set(0, "no testing"); //list[0] = "no testing";
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
//		list.add(3,"second elem");
		System.out.println(list);

		List<String> toChange = List.of("first");
		for (int i = 0; i < list.size(); i++) {
			if (toChange.size() > i) {
				list.set(i, toChange.get(i));
			}
		}
		System.out.println(list);

		List<String> removedList = new ArrayList<>(list);
		for (int i = 0; i < list.size(); i++) { // 0
			if (list.get(i).length() > 3) {
				removedList.remove(list.get(i));
				//list.remove(list.get(i));
			}
		}
		System.out.println(list);
		System.out.println(removedList);
		list.add("test2");
		list.add("A");
		list.add("Ab");
		list.add("Abc");
		list.add("Aaa");

		int count = 0;
		for (int i = 0; i < list.size(); i++) { // 0
			if (list.get(i).equals("test2")) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println("--------");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		//
		int[] arrayTest = new int[10];
		// Arrays.binarySearch(arrayTest, 4);
		// заполнен
		// отсортирован
		// бинарный поиск
		// binarySearch(array, num, 0, 10);
		// array[5] если он больше чем то что там лежит то запускаем метод binarySearch(array, num, 5, 10);
		// если равно то возращаем что нашли
		// если меньше то апускаем поиск на левой полвине binarySearch(array, num, 0, 5);

	}
}
