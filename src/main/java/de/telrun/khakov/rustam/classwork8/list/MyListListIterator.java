package de.telrun.khakov.rustam.classwork8.list;

import java.util.ListIterator;

/**
 * @author Rustam Khakov
 */
public class MyListListIterator implements ListIterator<Integer> {
	private Node currentNode;
	private Node prevNode;
	int index;


	public MyListListIterator(Node currentNode) {
		this.currentNode = currentNode;// null <- node 1> -> <node 2> -> <node 3> -> <node 4> -> null
		prevNode = null;//node 1
	}

	@Override
	public boolean hasNext() {
		return currentNode != null;
	}

	@Override
	public Integer next() {
		Integer value = currentNode.getValue();
		prevNode = currentNode;
		currentNode = currentNode.getNext();
		index++;
		return value;
	}
	@Override
	public boolean hasPrevious() {
		return prevNode != null;// 1-> 2->3->4->5-> null
	}

	@Override
	public Integer previous() {
		Integer value = currentNode.getValue();
		prevNode = prevNode.getPrev();
		currentNode = currentNode.getPrev();
		index--;
		return value;
	}

	@Override
	public int nextIndex() {
		return index+1;
	}

	@Override
	public int previousIndex() {
		return index-1;
	}







	@Override
	public void remove() {

	}

	@Override
	public void set(Integer integer) {

	}

	@Override
	public void add(Integer integer) {

	}
}
