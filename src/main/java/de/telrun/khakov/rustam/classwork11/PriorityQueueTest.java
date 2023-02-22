package de.telrun.khakov.rustam.classwork11;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Rustam Khakov
 */
public class PriorityQueueTest {
	public static void main(String[] args) {
		Queue<String> strings = new PriorityQueue<>();
		strings.add("First");
		strings.add("Second");
		strings.add("Third");
		strings.add("Fourth");
		System.out.println(strings);
	}
}
