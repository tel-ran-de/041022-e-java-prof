package de.telrun.khakov.rustam.classwork1;

/**
 * @author Rustam Khakov
 */
public class Student {
	private String name;
	private int age;

	private boolean rich;

	public Student() {
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Student(int age, String name) {
		this.name = name;
		this.age = age;
	}
	// 1 - можем создавать методы с разной сигнатурой
	// 2 - можем создавать конструкторы с разной сигнатурой

	int test() { // test()
		return 1;
	}
	
	public int test(int val) { // test(int)
		return 1;
	}
	private int test2(int val) { // test2(int)
		return 1;
	}

	void test(int val, int val2) { //test(int, int)
	}


	public Student(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void inviteToBirthday() {
		incrementAge();
		System.out.println("Happy birthday " + this.name);
	}

	private void incrementAge() {
		this.age += 1;
	}

	public void sayHello() {
		System.out.println("Hello");
	}

	public boolean isRich() {
		return rich;
	}
}
