package de.telrun.khakov.rustam.classwork7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

/**
 * @author Rustam Khakov
 */
public class IteratorTest {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("first");
		strings.add("sec");
		strings.add("test");
		strings.add("third33");
		strings.add("forth33");
		strings.add("fith");
		strings.add("test");

		for (int i = 0; i < strings.size(); i++) {
			System.out.println(strings.get(i));
		}

		System.out.println("iterator example: ");


		Iterator<String> iterator = strings.iterator();// int i =0
		while (iterator.hasNext()) {// есть ли следующий элемент? да i<size()
			String currentVal = iterator.next();// верни след элемент array[i];
			System.out.println(currentVal);
		}

		for (String currentElem : strings) {
			System.out.println(currentElem);
		}

//		int[] array = new int[10];
//		for (int value : array) {
//			System.out.println(value);
//		}


//		ListIterator<String> iterator = strings.listIterator();
//		while (iterator.hasNext()) {// есть ли следующий элемент? да
//			String currentVal = iterator.next();// верни след элемент
//			System.out.println(currentVal);
//			if (currentVal.length() > 5) {
//				iterator.remove();// удали
//				iterator.add("test-iterator");
//				iterator.add("test-iterator");
//			} else {
//				iterator.set("test-iterator-2");
//			}
//		}

		System.out.println(strings);
	}
}
