package de.telrun.khakov.rustam.homework10;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class BookSorter {

	public void sort(List<Book> books) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Хотите сортировать по имени?");
		String res = scanner.nextLine();
		Comparator<Book> comparator = null;
		if ("Да".equals(res)) {
			// Comparator current = new NameComparator();
			System.out.println("Хотите сортировать в каком порядке? asc/ desc?");
			String asc = scanner.nextLine();
			if (!"asc".equals(asc)) {
				//current = current.reversed();
			}
			if (comparator == null) {
				//comparator = current;
			} else {
				//comparator = comparator.thenComparing(current);
			}
		}
		comparator = askAndAddComparator(scanner, comparator, "Хотите сортировать по автору?", new AuthorComparator());
		comparator = askAndAddComparator(scanner, comparator, "Хотите сортировать по издательству?", new AuthorComparator());

	}

	private Comparator<Book> askAndAddComparator(Scanner scanner,
												 Comparator<Book> comparator,
												 String questions,
												 Comparator<Book> current) {


		System.out.println(questions);
		String res = scanner.nextLine();
		if ("Да".equals(res)) {
			System.out.println("Хотите сортировать в каком порядке? asc/ desc?");
			String asc = scanner.nextLine();
			if (!"asc".equals(asc)) {
				//current = current.reversed();
			}
			if (comparator == null) {
				//comparator = current;
			} else {
				//comparator = comparator.thenComparing(current);
			}

		}
		return comparator;
	}
}
