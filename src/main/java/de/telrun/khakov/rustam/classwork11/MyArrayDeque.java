package de.telrun.khakov.rustam.classwork11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

/**
 * @author Rustam Khakov
 */
public class MyArrayDeque implements Deque<Integer> {
	private static int DEFAULT_SIZE = 10;

	Integer[] elements;
	int size;
	int head;
	int tail;

	public MyArrayDeque() {

	}

	private int inc(int index) {
		if (index == elements.length - 1) {
			return 0;
		}
		return index + 1;
	}

	private int dec(int index) {
		if (index == 0) {
			return elements.length - 1;
		}
		return index - 1;
	}

	private void grow() {
		int oldCapacity = elements.length;
		int newCapacity = oldCapacity + oldCapacity / 2;
		Integer[] newArray = Arrays.copyOf(elements, newCapacity);
		if (head > tail) {
			System.arraycopy(elements, head, newArray,
					newCapacity - oldCapacity,
					oldCapacity - head);
			for (int i = head; i < oldCapacity - head; i++) {
				newArray[i] = null;
			}
			head = oldCapacity - head;
		}
		elements = newArray;
	}

	@Override
	public void addFirst(Integer newElem) {
		if (elements == null) {
			elements = new Integer[DEFAULT_SIZE];
		}
		if (dec(head) == tail) {
			grow();
		}
		head = dec(head);
		elements[head] = newElem;
	}

	@Override
	public void addLast(Integer newElem) {
		if (elements == null) {
			elements = new Integer[DEFAULT_SIZE];
		}
		if (head == inc(tail)) {
			grow();
		}
		elements[tail] = newElem;
		tail = inc(tail);
	}

	@Override
	public Integer removeFirst() {
		Integer elem2Remove = elements[head];
		elements[head] = null;
		head = inc(head);
		return elem2Remove;
	}

	@Override
	public Integer removeLast() {
		Integer elem2Remove = elements[head];
		elements[head] = null;
		tail = dec(tail);
		return elem2Remove;
	}

	@Override
	public Integer pollFirst() {
		return removeFirst();
	}

	@Override
	public Integer pollLast() {
		return removeLast();
	}

	@Override
	public Integer getFirst() {
		return elements[head];
	}

	@Override
	public Integer getLast() {
		return elements[tail];
	}

	@Override
	public Integer peekFirst() {
		return getFirst();
	}

	@Override
	public Integer peekLast() {
		return getLast();
	}


	@Override
	public boolean offerFirst(Integer elem) {
		return false;
	}

	@Override
	public boolean offerLast(Integer elem) {
		return false;
	}

	@Override
	public boolean removeFirstOccurrence(Object o) {
		return false;
	}

	@Override
	public boolean removeLastOccurrence(Object o) {
		return false;
	}

	@Override
	public boolean add(Integer integer) {
		return false;
	}

	@Override
	public boolean offer(Integer integer) {
		return false;
	}

	@Override
	public Integer remove() {
		return null;
	}

	@Override
	public Integer poll() {
		return null;
	}

	@Override
	public Integer element() {
		return null;
	}

	@Override
	public Integer peek() {
		return null;
	}

	@Override
	public boolean addAll(Collection<? extends Integer> c) {
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
	public void clear() {

	}

	@Override
	public void push(Integer integer) {
		addLast(integer);
	}

	@Override
	public Integer pop() {
		return removeLast();
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean contains(Object o) {
		return false;
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
	public Object[] toArray() {
		return new Object[0];
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}

	@Override
	public Iterator<Integer> descendingIterator() {
		return null;
	}
}
