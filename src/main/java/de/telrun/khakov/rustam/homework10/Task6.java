package de.telrun.khakov.rustam.homework10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Rustam Khakov
 */
public class Task6 {
	public static void main(String[] args) {
		List<Advertisement> adv = Arrays.asList(
				new Advertisement(100, "Гараж", "недорого", "дядя Вася", 2010),
				new Advertisement(120, "Гараж", "недорого", "дядя Вася", 2011),
				new Advertisement(100, "Гараж", "недорого", "дядя Петя", 2011),
				new Advertisement(1000, "Машина", "недорого", "дядя Вася", 2011),
				new Advertisement(1100, "Дом", "недорого", "дядя Вася", 2013),
				new Advertisement(10, "Игрушка", "качественная", "Маша", 2012),
				new Advertisement(100, "Игрушка", "б/у", "Даша", 2012)
		);
		Newspaper wallStreetJournal = new Newspaper(adv, new NameComparator());
		Newspaper murzilka = new Newspaper(new ArrayList<>(adv),
				new NameComparator().thenComparing(new PriceComparator())
		);
		System.out.println(wallStreetJournal);
		System.out.println(murzilka);


	}
}
