package de.telrun.khakov.rustam.homework5;

import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class Task22 {
	public static void main(String[] args) {
		//Создать 2 двумерных массива 5x5 и заполнить их числами, написать программу для нахождения суммы двух массивов
		// создать двумерный массив [5][5] заполнить его рандомными значениями и прибавить другой массив
		int x = 5;
		int[][] firstArray = new int[x][x];
		int[][] secondArray = new int[x][x];
		//заполнить
		fillArrayWithRandomValues(firstArray);
		fillArrayWithRandomValues(secondArray);


		TwoDimensonalArray twoDimensonalArray = new JavaTwoDimensinalArray(firstArray);
		TwoDimensonalArray twoDimensonalArray2 = new JavaTwoDimensinalArray(secondArray);
		TwoDimensonalArray sum = twoDimensonalArray.add(twoDimensonalArray2); // twoDimensonalArray + twoDimensonalArray2

		twoDimensonalArray.print();
		System.out.println("----------");
		twoDimensonalArray2.print();
		System.out.println("----------");
		sum.print();


//
//		int[][] sumArray = sumTwoArrays(firstArray, secondArray);
//		print2DimensonalArray(sumArray);
	}

	public static int[][] sumTwoArrays(int[][] firstArray, int[][] secondArray) {
		int[][] sumArray = new int[firstArray.length][secondArray.length];
		for (int i = 0; i < sumArray.length; i++) {
			for (int j = 0; j < sumArray[i].length; j++) {
				sumArray[i][j] = firstArray[i][j] + secondArray[i][j];
			}
		}
		return sumArray;
	}

	public static void print2DimensonalArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void fillArrayWithRandomValues(int[][] array) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(100);
			}
		}
	}

	public static void fillArrayWithRandomValues(int[][] array, int min, int max) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(min, max);
			}
		}
	}
}
