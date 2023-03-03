package de.telrun.khakov.rustam.classwork14;

/**
 * @author Rustam Khakov
 */
public class GraphTester {
	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.add(1,2, 4);
		graph.add(3,1, 6);
		graph.add(1,5, 1);
		graph.add(2,3, 2);
		graph.add(3,4, 4);
		graph.add(6,7, 7);
		graph.add(7,1, 8);
		graph.add(8,8, 7);
		graph.add(7,9, 6);
		// print graph
		//graph.print();
		//graph.printBfs();
		//graph.printDfs();
		graph.findCycles();

	}
}
