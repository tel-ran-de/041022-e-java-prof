package de.telrun.khakov.rustam.classwork13;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Rustam Khakov
 */
public class Tree {

	private Node root;

	public Tree() {
	}

	public void printBfs() {
		Queue<Node> queue = new ArrayDeque<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node currentNode = queue.poll();
			System.out.println(currentNode.key);
			if (currentNode.left != null) {
				queue.add(currentNode.left);
			}
			if (currentNode.right != null) {
				queue.add(currentNode.right);
			}
		}
	}

	public void print() {
		Queue<Node> currentLineNodes = new LinkedList<>();
		currentLineNodes.add(root);
		Queue<Node> nextLineNodes = new LinkedList<>();
		int gap = 32;
		boolean hasChildren = false;
		for (int i = 0; i < gap; i++) {
			System.out.print(" ");
		}
		while (!currentLineNodes.isEmpty()) {
			Node currentNode = currentLineNodes.poll();
			if (currentNode != null) {
				System.out.print(currentNode.key);
				nextLineNodes.add(currentNode.left);
				nextLineNodes.add(currentNode.right);
				hasChildren = hasChildren || currentNode.left != null || currentNode.right != null;
			} else {
				nextLineNodes.add(null);
				nextLineNodes.add(null);
				System.out.print("_");
			}
			for (int i = 0; i < gap * 2; i++) {
				System.out.print(" ");
			}
			if (currentLineNodes.isEmpty()) {
				if (!hasChildren) {
					break;
				}
				hasChildren = false;
				System.out.println();
				gap = gap / 2;
				for (int i = 0; i < gap; i++) {
					System.out.print(" ");
				}
				currentLineNodes = nextLineNodes;
				nextLineNodes = new LinkedList<>();
			}
		}
	}

	public boolean add(int value) {
		Node currentNode = new Node();
		currentNode.key = value;
		if (root == null) {
			root = currentNode;
			return true;
		} else {
			Node comparingNode = root;
			while (comparingNode != null) {
				if (comparingNode.key < value) {
					if (comparingNode.right == null) {
						comparingNode.right = currentNode;
						return true;
					}
					comparingNode = comparingNode.right;
				} else if (comparingNode.key > value) {
					if (comparingNode.left == null) {
						comparingNode.left = currentNode;
						return true;
					}
					comparingNode = comparingNode.left;
				} else {
					return false;
				}
			}
		}
		return false;
	}

	public static class Node {
		private Node left;
		private Node right;
		private int key;
	}


}
