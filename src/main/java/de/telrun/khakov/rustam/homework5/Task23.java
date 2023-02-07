package de.telrun.khakov.rustam.homework5;

import static de.telrun.khakov.rustam.homework5.Task22.fillArrayWithRandomValues;

/**
 * @author Rustam Khakov
 */
public class Task23 {
	public static void main(String[] args) {
		int size = 10;
		int[][] twoDimArray = new int[size][size];
		fillArrayWithRandomValues(twoDimArray, 0, 100);
		int sum = 0;
		for (int i = 0; i < twoDimArray.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (twoDimArray[i][j] < 0) {
					sum++;
				}
			}
		}
		System.out.println(sum);
	}
}
