package de.telrun.khakov.rustam.claswork12;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rustam Khakov
 */
public class MapTests {
	public static void main(String[] args) {
		//Учитывая список билетов, найти маршрут по порядку, используя данный список.
		//Вход:
		//«Berlin» -> «London»
		//«Tokyo» -> «Seoul»
		//«Mumbai» -> «Berlin»
		//«Seoul» -> «Mumbai»
		//
		//Выход:
		//Tokyo->Seoul, Seoul->Mumbai, Mumbai->Berlin, Berlin->Lindon

		Map<String, String> fromToMap = new HashMap<>();
		fromToMap.put("Berlin", "London");
		fromToMap.put("Tokyo", "Seoul");
		fromToMap.put("Mumbai", "Berlin");
		fromToMap.put("Seoul", "Mumbai");
		String toCity = "Tokyo";
		while (fromToMap.containsKey(toCity)) {
			System.out.println(toCity);
			toCity = fromToMap.get(toCity);
		}
		System.out.println(toCity);
	}
}
