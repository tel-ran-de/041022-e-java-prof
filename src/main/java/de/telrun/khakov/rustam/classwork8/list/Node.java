package de.telrun.khakov.rustam.classwork8.list;

/**
 * @author Rustam Khakov
 */
public class Node {
	private Integer value;
	private Node next;
	private Node prev;

	public Node(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}
}
