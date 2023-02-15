package de.telrun.khakov.rustam.classwork8.list;


import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Rustam Khakov
 * @see this#toArray() уже реализован
 * Уровень 1
 * @see this#size()
 * @see this#isEmpty()
 * @see this#iterator()
 * @see this#clear()
 * @see this#get(int)
 * @see this#set(int, Integer)
 * @see this#contains(Object)
 * @see this#indexOf(Object)
 * @see this#lastIndexOf(Object)
 * @see this#add(Integer)
 * Уровень 2
 * @see this#remove(Object)
 * @see this#remove(int)
 * @see this#add(int, Integer)
 */
public class MyArrayList implements List<Integer> {
	Integer[] array;
	int size;

	public MyArrayList() {
		array = new Integer[0];
		//todo реализуй меня
	}

	public MyArrayList(Integer[] array) {
		this.array = array;
		//todo реализуй меня
	}

	@Override
	public Object[] toArray() {
		return array;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new ArrayIterator(array);
	}

	@Override
	public void clear() {
		size = 0;
		array = new Integer[0];
	}

	@Override
	public Integer get(int index) {
		return array[index];
	}

	@Override
	public Integer set(int index, Integer newVal) {
		Integer prevVal = array[index];
		array[index] = newVal;
		return prevVal;
	}

	@Override
	public boolean add(Integer newVal) {
		Integer[] newArr = Arrays.copyOf(array, size + 1);
		newArr[size] = newVal;
		size++;
		array = newArr;
		return true;//создать новый массив потом сделать copy старых значений в новый массив
	}

	@Override
	public boolean contains(Object o) {
		for (Integer i : array) {
			if (i.equals(o)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean remove(Object o) {
		return remove(indexOf(o)) != null;//find by index -> remove by index
	}

	@Override
	public Integer remove(int index) {
		// создать копию массива на размер 1 меньше
		// нужно будет создать новый массив, после скопировать в него все что до этого индекса
		// скопировать все что после этого индекса
		Integer[] newArray = Arrays.copyOf(array, size - 1);
		for (int i = index; i < size - 1; i++) {
			newArray[i] = array[i + 1];
		}
		Integer prevVal = array[index];
		array = newArray;
		size--;
		return prevVal;
	}

	@Override
	public void add(int index, Integer newElem) {
		// нужно будет создать новый массив, после скопировать в него все что до этого индекса
		// вставить этот индекс и скопировать все что после этого индекса
		Integer[] newArray = Arrays.copyOf(array, size + 1);
		for (int i = index; i < size; i++) {
			newArray[i + 1] = array[i];
		}
		newArray[index] = newElem;
		array = newArray;
		size++;
	}

	@Override
	public int indexOf(Object o) {
		for (int i = 0; i < size; i++) {
			if (array[i].equals(o)) {
				return i;
			}
		}
		return -1;
	}


	@Override
	public int lastIndexOf(Object o) {
		for (int i = size - 1; i > 0; i--) {
			if (array[i].equals(o)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * !!!!!!!    все что ниже не реализовываем  !!!!!!!
	 */


	@Override
	public ListIterator<Integer> listIterator() {
		return null;
	}

	@Override
	public List<Integer> subList(int fromIndex, int toIndex) {
		return new MyArrayList(Arrays.copyOfRange(array, fromIndex, toIndex));
	}


	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Integer> c) {
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends Integer> c) {
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}

	@Override
	public ListIterator<Integer> listIterator(int index) {
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return null; //не реализовывать
	}
}
