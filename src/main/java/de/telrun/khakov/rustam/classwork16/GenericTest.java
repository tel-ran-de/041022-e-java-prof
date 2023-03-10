package de.telrun.khakov.rustam.classwork16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * @author Rustam Khakov
 */
public class GenericTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("str");
		list.add("str2");
		String str = list.get(0);
		List<? super Number> numbers = new ArrayList<>();// Producer extend -> Consumer super
		numbers.add(1);// 1-> int->Integer->Number->Object
		numbers.add(4.0);//4.0 -> double->Double->Number->Object
		numbers.add(1L);

		//(Integer) numbers.get(0);

		List<? extends String> list2 = list;//Producer extend
		//list2.add(1);

		for (String s : list) {
			System.out.println(s);
		}


//		notNull(str); /// (super Number)
//		notNull(list);
//		notNull(numbers);
	}

	public static <T extends Number> boolean notNull(T obj) {
		return obj != null;
	}
}
