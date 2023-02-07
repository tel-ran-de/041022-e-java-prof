package de.telrun.khakov.rustam.homework6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


/**
 * @author Rustam Khakov
 */
public class BinarySearch {
	public static void main(String[] args) {

//		List<Person> persons = new ArrayList<>();
//		List<Integer> numbers = new ArrayList<>();
//
//		for (int i = 0; i < persons.size(); i++) {
//			if ("Пупкин".equals(persons.get(i).getName())) {
//				numbers.add(persons.get(i).getNumber());
//			}
//		}


		int[] array = new int[10];
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			array[i] = random.nextInt(10);
		}
		Arrays.sort(array);
		int i = binarySearch(array, 8);
		System.out.println(i);
		System.out.println(Arrays.binarySearch(array, 8));
		System.out.println(Arrays.toString(array));
	}

	static int binarySearch(int[] array, int number) {

		int from = 0;
		int to = array.length - 1;
		while (to - from >= 0) {
			int middle = from + (to - from) / 2;
			if (number == array[middle]) {
				return middle;
			}
			if (number > array[middle]) {
				from = middle + 1;
			} else {
				to = middle - 1;
			}

		}

//		if (number > array[middle]){
//			binarySearch(array, number, middle, to);
//			// справа
//		} else {
//			//слева
//			binarySearch(array, number, from, middle);
//
//		}
		return -1;
	}
}
