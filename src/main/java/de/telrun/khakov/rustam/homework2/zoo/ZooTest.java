package de.telrun.khakov.rustam.homework2.zoo;

/**
 * @author Rustam Khakov
 */
public class ZooTest {

	public static void main(String[] args) {
		Animal cow = new Cow("Гадюша", "White");
		Animal dog = new Dog("Шарик", "Коричневый");
		Animal cat = new Cat("Матроскин", "пятнистый");
		Animal lamb = new Lamb("Шон", "White");
		cat.eat("meat");
		cat.eat("fruit");
		cow.eat("meat");
		cow.eat("fruit");



		Animal[] animals = new Animal[5];
		animals[0] = cow;
		animals[1] = dog;
		animals[2] = cat;
		animals[3] = lamb;
		animals[4] = new Cat("Барсик","рыжий");

		System.out.println("___________________");
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
			System.out.println(animals[i].voice());
			System.out.println("___________________");
		}

	}
}
