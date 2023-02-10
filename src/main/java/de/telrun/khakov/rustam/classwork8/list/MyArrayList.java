package de.telrun.khakov.rustam.classwork8.list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
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
 * @author Rustam Khakov
 */
public class MyArrayList implements List<Integer> {
	Integer[] array;

	public MyArrayList() {
		//todo реализуй меня
	}

	@Override
	public Object[] toArray() {
		return array;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public Iterator<Integer> iterator() {
		return null;
	}

	@Override
	public void clear() {

	}

	@Override
	public Integer get(int index) {
		return null;
	}

	@Override
	public Integer set(int index, Integer element) {
		return null;
	}

	@Override
	public boolean add(Integer integer) {
		return false;//создать новый массив потом сделать copy старых значений в новый массив
	}

	@Override
	public boolean contains(Object o) {
		return false;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public Integer remove(int index) {
		// создать копию массива на размер 1 меньше
		// нужно будет создать новый массив, после скопировать в него все что до этого индекса
		// скопировать все что после этого индекса
		return null;
	}

	@Override
	public void add(int index, Integer element) {
		// нужно будет создать новый массив, после скопировать в него все что до этого индекса
		// вставить этот индекс и скопировать все что после этого индекса
	}

	@Override
	public int indexOf(Object o) {
		return 0;
	}


	@Override
	public int lastIndexOf(Object o) {
		return 0;
	}

	/**
	 *     !!!!!!!    все что ниже не реализовываем  !!!!!!!
	 */



	@Override
	public ListIterator<Integer> listIterator() {
		return null;
	}

	@Override
	public List<Integer> subList(int fromIndex, int toIndex) {
		return null;
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
