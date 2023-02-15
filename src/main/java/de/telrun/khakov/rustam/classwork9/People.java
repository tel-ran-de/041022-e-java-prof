package de.telrun.khakov.rustam.classwork9;

import java.util.Objects;

/**
 * @author Rustam Khakov
 */
public class People {
	private String name;
	private int age;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		People people = (People) o;
		return age == people.age && Objects.equals(name, people.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
}
