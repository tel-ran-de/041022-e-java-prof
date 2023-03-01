package de.telrun.khakov.rustam.classwork13;

/**
 * @author Rustam Khakov
 */
public class TreeTest {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.add(10);
		tree.add(16);
		tree.add(2);
		tree.add(12);
		tree.add(14);
		tree.add(11);
		tree.add(18);
		tree.add(19);
		tree.add(15);
//		tree.printBfs();
		tree.print();

	}
}
