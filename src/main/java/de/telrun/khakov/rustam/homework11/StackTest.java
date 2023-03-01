package de.telrun.khakov.rustam.homework11;

import java.util.Stack;

/**
 * @author Rustam Khakov
 */
public class StackTest {

	public static void main(String[] args) {
		// ())
		String input = "()()";
		System.out.println(checkForCorrectness(input));

	}

	private static boolean checkForCorrectness(String input) {
		char[] chars = input.toCharArray();
		Stack<Character> bracetsStack = new Stack<>();
		for (Character c : chars) {
			if (c == '(') {
				bracetsStack.push(c);
			} else if (c == ')') {
				if (bracetsStack.isEmpty()) {
					return false;
				}
				bracetsStack.pop();
			}
		}
		return bracetsStack.isEmpty();
	}

	private static boolean checkForCorrectnessWithoutStack(String input) {
		char[] chars = input.toCharArray();
		int openCount = 0;
		for (Character c : chars) {
			if (c == '(') {
				openCount++;
			} else if (c == ')') {
				if (openCount <= 0) {
					return false;
				}
				openCount--;
			}
		}
		return openCount != 0;
	}
}
