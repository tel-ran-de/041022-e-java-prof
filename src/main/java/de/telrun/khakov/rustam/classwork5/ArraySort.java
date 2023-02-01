package de.telrun.khakov.rustam.classwork5;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class ArraySort {
	public static void main(String[] args) {
		int[] array = new int[1000];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(200);
		}

		// сортировка выборкой
		//1
		// 10 -> 55
		// 100 -> 5050 // x100
		// 1000 -> 500500 // x100
		// 10_000_000
		int sum = 0;
		//1000   100   10 000      1 000 000
		for (int i = 0; i < array.length; i++) {// 10
			int max = array[0];
			int maxIndex = 0;
			//10
			for (int j = 0; j < array.length - i; j++) { //10  9 8 7  6 5 4
				// compare and swap

				if (array[j] > max) {
					maxIndex = j;
					max = array[j];
				}
				sum++;
			}
			//swap
			int tmp = array[array.length - i - 1];
			array[array.length - i - 1] = max;
			array[maxIndex] = tmp;
		}
		System.out.println(sum);
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
	}
}
