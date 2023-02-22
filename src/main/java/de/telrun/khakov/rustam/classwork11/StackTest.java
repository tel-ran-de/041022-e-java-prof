package de.telrun.khakov.rustam.classwork11;

import java.util.Stack;

/**
 * @author Rustam Khakov
 */
public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("My");
		stack.push("Name");
		stack.push("is");
		stack.push("Robot");
		System.out.println(stack.search("Robot"));

		System.out.println(stack.peek());// Name
		System.out.println(stack.search("My"));
		System.out.println(stack.search("M"));
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

		System.out.println(stack);
	}
}
