package de.telrun.khakov.rustam.claswork12;

/**
 * @author Rustam Khakov
 */
public class CopyTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat cat = new Cat(3, "Том");
		cat.setToy(new Toy("погремушка"));
		Cat tom = (Cat) cat.clone();
		tom.getToy().setName("погром");
		System.out.println("cat 1: ");
		System.out.println(cat);
		System.out.println("cat 2: ");
		System.out.println(tom);

//
//				new Cat();
//		tom.setAge(cat.getAge());
//		tom.setName(cat.getName());
	}
}
