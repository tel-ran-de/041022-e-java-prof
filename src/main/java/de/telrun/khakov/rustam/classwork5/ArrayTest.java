package de.telrun.khakov.rustam.classwork5;

import de.telrun.khakov.rustam.homework2.card.CreditCard;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class ArrayTest {
	public static void main(String[] args) {
//		int[] arr = new int[10];/// int  int int int
//		int[] arr2 = {1, 3, 4, 6, 78,8, 14, 35};
//		String[] strings  = new String[10];
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(strings));
//		int[] newArr = Arrays.copyOfRange(arr2, 3, 5);
//		System.out.println(Arrays.toString(newArr));
//
//
//
//		Object[] objects = new Object[4];
//		objects[0] = "trttr";
//		objects[1] = 76;// autoboxing Integer(76)
//		objects[2] = new CreditCard("1233333", 6745);
//		objects[3] = arr;
//		System.out.println(Arrays.toString(objects));

		int[][] arr1 = new int[10][10];// [int[10]   int[10]  int[10].. ]
		Random random = new Random();
		//int x = 0;
		//Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				//arr1[i][j] = i + j;//scanner.nextInt();//random.nextInt(100);
				if ((i == j) || (i == arr1[i].length - 1 - j)) {
					arr1[i][j] = 0;
				}else {
					arr1[i][j] = 1;
				}
			}
		}

		//arr1[7][8] = 14;
		//arr1[6][4] = 187;
		printArray(arr1);
		//int[][][] thirdDimArray = new int[10][2][3];
		// 10 этажей по 2 блока и 3 квартиры в блоке
	}

	private static void printArray(int[][] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}
}
