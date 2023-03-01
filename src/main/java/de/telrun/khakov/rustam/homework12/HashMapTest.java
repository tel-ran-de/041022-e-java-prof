package de.telrun.khakov.rustam.homework12;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Rustam Khakov
 */
public class HashMapTest {
	public static void main(String[] args) {
		String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer eu feugiat tellus. Nam molestie diam sed libero egestas pellentesque. Nulla.";
		Map<Character, Integer> map = new HashMap<>();
		char[] chars = str.toCharArray();

		for (Character currentChar : chars) {
			Integer howManyTimesCharExists = map.get(currentChar);
			if (howManyTimesCharExists == null) {
				map.put(currentChar, 1);
			} else {
				map.put(currentChar, howManyTimesCharExists + 1);
			}
		}

		for (Character key: map.keySet()) {
			System.out.println("symbol '%s' exists %d times".formatted(key, map.get(key)));
		}

		List<String> results = List.of("1", "2", "2", "1", "2");
		Map<String, Integer> howManyTimes = new HashMap<>();
		for (String result : results) {
			Integer howManyTimesCharExists = howManyTimes.getOrDefault(result, 0);
			howManyTimes.put(result, howManyTimesCharExists + 1);
		}


	}
}
