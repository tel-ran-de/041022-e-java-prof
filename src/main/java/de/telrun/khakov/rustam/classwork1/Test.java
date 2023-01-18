package de.telrun.khakov.rustam.classwork1;

/**
 * @author Rustam Khakov
 */
public class Test {

	public static void main(String[] args) {
//		Student vasya = new Student("Vasya", 20);
//		Student petya = new Student("Petya", 19);
//
//		System.out.println(vasya.getName());
//		System.out.println(vasya.getAge());
//		System.out.println(petya.getName());
//		System.out.println(petya.getAge());
//		vasya.inviteToBirthday();
//		System.out.println(vasya.getAge());
//		petya.sayHello();
		Table bigTable = new Table("Черный", "Ikea", "Travensia", 2010);
		Table smallTable = new Table("Ikea", "Small table", 2015);
		bigTable.setColor("Белый");
		smallTable.setColor("Белый");
		System.out.println(bigTable);
		System.out.println(smallTable);
		smallTable.setColor("Зеленый акварель");
		bigTable.setColor("Зеленый акварель");
		System.out.println(bigTable); // зеленый акварель
		System.out.println(smallTable); // белый
	}
}
