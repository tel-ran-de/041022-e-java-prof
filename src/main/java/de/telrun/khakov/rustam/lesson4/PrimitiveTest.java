package de.telrun.khakov.rustam.lesson4;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class PrimitiveTest {
	public static void main(String[] args) {
		int i = 13;// 4 байта 32 бита
		short s = 67;
		long l = 3456;
		Integer integer; // null
		Short sh;
		Long lo;
		int[] values = new int[10];
		Integer[] values2 = new Integer[10];

		Integer integer1 = i; //autoboxing
		int val = integer1; // unboxing

		//Integer integer2 = null;
		//int val2 = integer2;// integer2.intValue()

		Random random = new Random();


		String str1 = new String("test");//
		String str2 = new String("test");

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		System.out.println(Arrays.toString(values));
		System.out.println(Arrays.toString(values2));

	}
}
