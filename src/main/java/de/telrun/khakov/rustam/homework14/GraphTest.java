package de.telrun.khakov.rustam.homework14;

/**
 * @author Rustam Khakov
 */
public class GraphTest {
	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.add("А", "Б",1);
		graph.add("А", "В",1);
		graph.add("А", "Г",1);
		graph.add("А", "Д",1);
		graph.add("Б", "В",1);
		graph.add("В", "Ж",1);
		graph.add("Г", "В",1);
		graph.add("Д", "Г",1);
		System.out.println(graph.howManyWays("А", "Г"));

	}
}
