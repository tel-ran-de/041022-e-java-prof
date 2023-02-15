package de.telrun.khakov.rustam.classwork8.list;

import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/**
 * @author Rustam Khakov
 */
public class MyListTest {
	public static void main(String[] args) {
		MyList values = new MyList();
		values.add(8);
		values.add(5);
		System.out.println(values.size());
		System.out.println(values.get(0));
		System.out.println(values.get(1));
		System.out.println(values.set(0, 7));
		System.out.println(values.get(0));
		values.add(0, 6);
		System.out.println("After insert");
		System.out.println(values.get(0));
		System.out.println(values.get(1));
		System.out.println(values.get(2));
		values.remove(0);
		System.out.println(values.get(1));

		values.descendingIterator();

		Iterator<Integer> iterator = values.iterator();
		for(Integer v: values) {

		}

	}
}
