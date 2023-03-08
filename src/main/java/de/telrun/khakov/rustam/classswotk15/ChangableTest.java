package de.telrun.khakov.rustam.classswotk15;

/**
 * @author Rustam Khakov
 */
public class ChangableTest {
	public static void main(String[] args) {
		NonChangableClass nonChangableClass = new NonChangableClass(1, "my password");
		///
		final String testS = "test String";
		//testS = "anotherStr";

		String testStr = "I love java very much";
		testStr = "another string";
		String replacedStr = testStr.replace('o', 'a');
		System.out.println(replacedStr);
	}
}
