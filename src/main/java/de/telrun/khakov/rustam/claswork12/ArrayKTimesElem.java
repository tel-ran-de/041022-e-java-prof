package de.telrun.khakov.rustam.claswork12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Rustam Khakov
 */
public class ArrayKTimesElem {

	public static void main(String[] args) {
		//Первый элемент, встречающийся k раз в массиве
		List<Integer> list = new ArrayList<>(100);
		for (int i = 0; i < 100; i++) {
			list.add(ThreadLocalRandom.current().nextInt(100));
		}
		Map<Integer, Integer> howManyTimesEntered = new HashMap<>();
		int k = 3;
		for (int i = 0; i < list.size(); i++) {
			Integer val = howManyTimesEntered.get(list.get(i));
			if (val == null) {
				howManyTimesEntered.put(list.get(i), 1);
			} else {
				howManyTimesEntered.put(list.get(i), val + 1);
			}
		}

		for (Integer key : howManyTimesEntered.keySet()) {
			if (k == howManyTimesEntered.get(key)) {
				System.out.println(key);
				return;
			}
		}
	}
}
