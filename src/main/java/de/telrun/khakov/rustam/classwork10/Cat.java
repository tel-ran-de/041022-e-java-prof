package de.telrun.khakov.rustam.classwork10;

import java.util.Objects;

/**
 * @author Rustam Khakov
 */
public class Cat implements Comparable<Cat> {
	private String name;
	private int birthYear;
	private int wight;

	public Cat(String name) {
		this.name = name;
	}

	public Cat(String name, int birthYear, int wight) {
		this.name = name;
		this.birthYear = birthYear;
		this.wight = wight;
	}

	public String getName() {
		return name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public int getWight() {
		return wight;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Cat cat = (Cat) o;
		return birthYear == cat.birthYear && wight == cat.wight && Objects.equals(name, cat.name);
	}

	@Override
	public String toString() {
		return "Cat{" +
				"name='" + name + '\'' +
				", birthYear=" + birthYear +
				", wight=" + wight +
				'}';
	}

	@Override
	public int compareTo(Cat o) {
		int yearsCompare = Integer.compare(this.getBirthYear(), o.getBirthYear());
		if (yearsCompare == 0) {
			int nameCompare = this.name.compareTo(o.name);
			if (nameCompare == 0) {
				return Integer.compare(this.wight, o.wight);
			}
			return nameCompare;
		}
		return yearsCompare;
//		if (this.getBirthYear() > o.getBirthYear()) {
//			return 1;
//		} else if (this.getBirthYear() < o.getBirthYear()) {
//			return -1;
//		} else {
//			return this.name.compareTo(o.name);
//		}
	}
}
