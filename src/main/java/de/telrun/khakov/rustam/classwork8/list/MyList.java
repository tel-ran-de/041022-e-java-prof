package de.telrun.khakov.rustam.classwork8.list;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/**
 * @author Rustam Khakov
 */
public class MyList implements List<Integer>, Deque<Integer> {
	private int size;
	private Node first;
	private Node last;

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean add(Integer currentVal) {
		Node currentNode = new Node(currentVal);
		if (this.first == null) {
			this.first = currentNode;
			this.last = currentNode;
		} else {
			currentNode.setPrev(this.last);
			this.last.setNext(currentNode);
			this.last = currentNode;
		}
		this.size++;
		return true;
	}

	@Override
	public Integer get(int index) {
		return findNodeByIndex(index).getValue();
	}

	@Override
	public Integer set(int index, Integer newValue) {
		Node nodeByIndex = findNodeByIndex(index);
		Integer prevValue = nodeByIndex.getValue();
		nodeByIndex.setValue(newValue);
		return prevValue;
	}

	@Override
	public void add(int index, Integer newValue) {
		Node newNode = new Node(newValue);
		Node prevNodeAtIndex = findNodeByIndex(index);
		newNode.setPrev(prevNodeAtIndex.getPrev());
		newNode.setNext(prevNodeAtIndex);
		prevNodeAtIndex.setPrev(newNode);
		if (newNode.getPrev() != null) {
			newNode.getPrev().setNext(newNode);
		} else {
			this.first = newNode;
		}
		size++;
	}


	@Override
	public void clear() {
		size = 0;
		first = null;
		last = null;
	}


	@Override
	public Integer remove(int index) {
		Node node2Remove = findNodeByIndex(index);
		Integer removedValue = node2Remove.getValue();
		Node prevNode = node2Remove.getPrev();
		Node nextNode = node2Remove.getNext();
		if (prevNode != null) {
			prevNode.setNext(nextNode);
		} else {
			this.first = nextNode;
		}

		if (nextNode != null) {
			nextNode.setPrev(prevNode);
		} else {
			this.last = prevNode;
		}
		node2Remove.setPrev(null);
		node2Remove.setNext(null);
		size--;
		return removedValue;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new MyListIterator(first);
	}

	@Override
	public boolean remove(Object o) {
		Iterator<Integer> iterator = iterator();
		int index = 0;
		while (iterator.hasNext()) {
			if (iterator.next().equals(o)) {
				remove(index);
				return true;
			}
			index++;
		}
		return false;
	}


	@Override
	public boolean contains(Object o) {
		Iterator<Integer> iterator = iterator();
		while (iterator.hasNext()) {
			if (iterator.next().equals(o)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int indexOf(Object o) {
		Iterator<Integer> iterator = iterator();
		int index = 0;
		while (iterator.hasNext()) {
			if (iterator.next().equals(o)) {
				return index;
			}
			index++;
		}
		return -1;
	}

	@Override
	public boolean addAll(Collection<? extends Integer> c) {
		for (Integer i : c) {
			add(i);
		}
		return true;
	}

	private Node findNodeByIndex(int index) {
		// если index > size/2 -> с конца до индекса уменьшая теукщий индекс
		// иначе с начала до индекса
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		boolean iterateFromFirst = index <= size / 2;
		int currentIndex = 0;
		if (iterateFromFirst) {
			Node currentNode = first;
			while (index != currentIndex) {
				currentIndex++;
				currentNode = currentNode.getNext();
			}
			return currentNode;
		} else {
			currentIndex = size - 1;
			Node currentNode = last;
			while (index != currentIndex) {
				currentIndex--;
				currentNode = currentNode.getPrev();
			}
			return currentNode;
		}
	}

	/**
	 * Уровень 2 - методы
	 *
	 * @see this#findNodeByIndex(int) - сделать поиск с конца, если индекс находится во второй половине списка
	 * @see this#descendingIterator() - итератор из конца в начало
	 * @see this#listIterator() - итератор с дополнительной сылкой на предыдущий
	 * @see this#toArray() - перевести в массив
	 * @see this#containsAll(Collection) - проверить содержатся ли все
	 * @see this#removeAll(Collection) - удалить все которые содержатся в коллекции
	 * @see this#lastIndexOf(Object)  - последний индекс входного элемента (идеально пожходит итератор с конца в начало)
	 * Уровень 3
	 * @see this#subList(int, int) - вернуть новый майлист который будет обрезан
	 * @see this#addAll(int, Collection) - добавить все начиная с какого-то индекса
	 * @see this#retainAll(Collection) - удалить все что не содержится во входной коллекции
	 */

	@Override
	public Iterator<Integer> descendingIterator() {
		return new DescendingListIterator(last);
	}

	@Override
	public ListIterator<Integer> listIterator() {
		return new MyListListIterator(first);
	}


	@Override
	public Object[] toArray() {
		Object[] arr = new Object[size];
		Iterator<Integer> iterator = iterator();
		int index = 0;
		while (iterator.hasNext()) {
			arr[index] = iterator.next();
			index++;
		}
		return arr;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		for (Object i : c) {
			if (!contains(i)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		for (Object i : c) {
			remove(i);
		}
		return true;
	}

	@Override
	public int lastIndexOf(Object o) {
		Iterator<Integer> iterator = descendingIterator();
		int index = size - 1;
		while (iterator.hasNext()) {
			if (iterator.next().equals(o)) {
				return index;
			}
			index--;
		}
		return -1;
	}


	@Override
	public List<Integer> subList(int fromIndex, int toIndex) {
		Node subListCurrentNode = findNodeByIndex(fromIndex);
		List<Integer> subList = new MyList();
		int current = fromIndex;
		while (current!= toIndex) {
			subList.add(subListCurrentNode.getValue());
			subListCurrentNode = subListCurrentNode.getNext();
			current++;
		}
		return subList;
	}

	@Override
	public boolean addAll(int index, Collection<? extends Integer> c) {
		int toInsertIndex = index;
		for (Integer i : c) {
			add(toInsertIndex, i);
			toInsertIndex++;
		}
		return true;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		Iterator<Integer> it = iterator();
		while (it.hasNext()) {
			if (!c.contains(it.next())) {
				it.remove();
			}
		}
		return true;
	}


	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}


	@Override
	public void push(Integer integer) {
		add(0, integer);
	}

	@Override
	public Integer pop() {
		return remove(size - 1);
	}

	@Override
	public ListIterator<Integer> listIterator(int index) {
		return null;
	}

	@Override
	public void addFirst(Integer integer) {
		add(0, integer);
	}

	@Override
	public void addLast(Integer integer) {
		add(integer);
	}

	@Override
	public boolean offerFirst(Integer integer) {
		return false;
	}

	@Override
	public boolean offerLast(Integer integer) {
		return false;
	}

	@Override
	public Integer removeFirst() {
		return remove(0);
	}

	@Override
	public Integer removeLast() {
		return remove(size - 1);
	}

	@Override
	public Integer pollFirst() {
		return remove(0);
	}

	@Override
	public Integer pollLast() {
		return remove(size - 1);
	}

	@Override
	public Integer getFirst() {
		return get(0);
	}

	@Override
	public Integer getLast() {
		return get(size - 1);
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
	public boolean removeFirstOccurrence(Object o) {
		return false;
	}

	@Override
	public boolean removeLastOccurrence(Object o) {
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
}
