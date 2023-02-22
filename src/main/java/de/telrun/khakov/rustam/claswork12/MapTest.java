package de.telrun.khakov.rustam.claswork12;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rustam Khakov
 */
public class MapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Петя", "живет через улицу");
		map.put("Петя", "живет на соседней улице");
		map.put("Вася", "живет  по соседству");
		map.put("Даша", "живет через улицу");
		map.put("Маша", "живет на соседней улице");
		Cat cat = new Cat();
		Cat cat1 = new Cat();
		System.out.println(cat.hashCode());
		System.out.println(cat1.hashCode());
		Toy test = new Toy("test");
		Toy test2 = new Toy("test2");
		System.out.println(test.hashCode());
		System.out.println(test2.hashCode());

		Map<Cat, Toy> catToyMap = new HashMap<>();
		catToyMap.put(cat, test);
		catToyMap.put(cat1, test2);

		//System.out.println(map);
	}
}
