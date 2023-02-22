package de.telrun.khakov.rustam.classwork11;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Rustam Khakov
 */
public class DequeTest {
	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		deque.addFirst(10);
		deque.addLast(11);
		deque.addLast(12);
		deque.addLast(13);
		deque.addFirst(9);
		deque.addFirst(8);

		System.out.println(deque.removeFirst());
		System.out.println(deque.removeFirst());
		System.out.println(deque.removeFirst());
		System.out.println(deque.removeFirst());
		System.out.println(deque.removeFirst());
		System.out.println(deque.removeFirst());

	}
}
