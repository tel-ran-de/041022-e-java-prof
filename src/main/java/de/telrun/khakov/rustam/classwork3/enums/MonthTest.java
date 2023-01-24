package de.telrun.khakov.rustam.classwork3.enums;

import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class MonthTest {

	public static void main(String[] args) {
		Month[] values = Month.values();
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
			System.out.println(values[i].ordinal());
		}

		System.out.println(Month.FEBRUARY.ordinal());
		Scanner scanner = new Scanner(System.in);
		Month month = Month.valueOf(scanner.nextLine());
		System.out.println(month);
		Month month1 = Month.APRIL;
		switch (month1) {
			case MAY -> System.out.println("");
			case JUNE -> System.out.println("fs");
			///
			default -> System.out.println("no");
		}
	}
}
