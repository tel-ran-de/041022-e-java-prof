package de.telrun.khakov.rustam.homework5;

import java.lang.reflect.Array;
import java.util.Arrays;

import static de.telrun.khakov.rustam.homework5.Task22.fillArrayWithRandomValues;
import static de.telrun.khakov.rustam.homework5.Task22.print2DimensonalArray;

/**
 * @author Rustam Khakov
 */
public class Task3 {
	public static void main(String[] args) {
		int size = 10;
		int[][] twoDimArray = new int[size][size];
		fillArrayWithRandomValues(twoDimArray, 0, 100);
		//2) Найти максимальный элемент побочной диагонали (cлайд 14 поможет)
		//int[] diagonalElems = new int[size];

		int howManyOp = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < twoDimArray.length; i++) {
			max = Math.max(max, twoDimArray[i][twoDimArray[i].length - 1 - i]);
		}
		System.out.println(howManyOp);
		//System.out.println(Arrays.toString(diagonalElems));
		System.out.println("--------------------");
		print2DimensonalArray(twoDimArray);


		System.out.println(max);

		// 1 умеем находить максимальный элемент в массиве
		//
	}
}
