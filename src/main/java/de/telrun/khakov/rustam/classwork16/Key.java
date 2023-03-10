package de.telrun.khakov.rustam.classwork16;


/**
 * @author Rustam Khakov
 */
public record Key(int age, String name) {

	public Key {
		if (name.length() < 3) {
			System.out.println("short name");
		}
	}

	public void test() {
		System.out.println("test me");
	}

}
