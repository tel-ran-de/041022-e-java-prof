package de.telrun.khakov.rustam.homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Rustam Khakov
 */
public class Task22 {
	public static void main(String[] args) {
		//Дан число k и ArrayList, содержащий целые числа. Необходим циклически сдвинуть числа в ArrayList вправо
		// на k позиций. Например, 1 - 2 - 3 - 4 - 5 - 6 при k = 1 преобразуется в 6 - 1 - 2 - 3 - 4 - 5, а
		// при k = 3 в 4 - 5 - 6 - 1 - 2 - 3.
		List<Integer> array = List.of(1, 2, 3, 4, 5, 6);
		List<Integer> arrayListCopy = new ArrayList<>(array.size());

		int[] simpleArray = new int[]{1, 2, 3, 4, 5, 6};
		int[] arrayCopy = new int[simpleArray.length];
		int k =2;
		for (int i = 0; i < k; i++) {
			//arrayListCopy.add(i, array.get(array.size() - k + i));
			arrayCopy[i] = arrayCopy[simpleArray.length - k + i];
			arrayListCopy.add(array.get(array.size() - k + i));
		}
		for (int i = 0; i < simpleArray.length - k; i++) {
			arrayCopy[i +1] = arrayCopy[i];
			arrayListCopy.add(array.get(i));
		}
		Collections.swap(array, 1,3);
		Collections.rotate(array, 1);
		List<Integer> unmodifableColl = Collections.unmodifiableList(arrayListCopy);

//		Collections.swap(simpleArray, 1,3);
		System.out.println(arrayListCopy);

//		int i = 0;
//		boolean processed = false;
//		while (i != 0 || !processed){
//			int changePos = (i + k) % array.size();
//			int temp = array.get(changePos);
//			array.set(changePos, array.get(i));
//			i = changePos;
//		}

	}
}
