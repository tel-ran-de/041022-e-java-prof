package de.telrun.khakov.rustam.classwork8.list;

import java.util.Iterator;

/**
 * @author Rustam Khakov
 */
public class MyListIterator implements Iterator<Integer> {
	private Node currentNode;

	public MyListIterator(Node currentNode) {
		this.currentNode = currentNode;// <node 1> -> <node 2> -> <node 3> -> <node 4> -> null
	}

	@Override
	public boolean hasNext() {
		return currentNode != null;
	}

	@Override
	public Integer next() {
		Integer value = currentNode.getValue();
		currentNode = currentNode.getNext();
		return value;
	}
}
