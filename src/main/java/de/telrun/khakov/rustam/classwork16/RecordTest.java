package de.telrun.khakov.rustam.classwork16;

import de.telrun.khakov.rustam.classwork3.Person;

/**
 * @author Rustam Khakov
 */
public class RecordTest {
	public static void main(String[] args) {
		Key key = new Key(20, "Vasya");
		Key key2 = new Key(20, "Vasya");
		key.age();
		key.name();
		key.test();
		System.out.println(key.equals(key2));
		System.out.println(key.hashCode());
		System.out.println(key);
		System.out.println(new Person());

	}
}
