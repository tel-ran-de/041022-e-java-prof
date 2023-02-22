package de.telrun.khakov.rustam.claswork12;

import java.util.Objects;

/**
 * @author Rustam Khakov
 */
public class Cat extends Animal implements Cloneable {
	private int age;
	private String name;
	private Toy toy;

	public Cat(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public Cat() {
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void voice() {
		//
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Cat cat = (Cat) o;
		return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(toy, cat.toy);
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, toy);
	}

	// protected
	// package -> protected -> public
	@Override
	public Object clone() throws CloneNotSupportedException {
		Cat clone = (Cat) super.clone();
		clone.setToy((Toy) toy.clone());
		return clone;
	}

	public Toy getToy() {
		return toy;
	}

	public void setToy(Toy toy) {
		this.toy = toy;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"age=" + age +
				", name='" + name + '\'' +
				", toy=" + toy +
				'}';
	}
}
