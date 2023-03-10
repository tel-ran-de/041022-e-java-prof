package de.telrun.khakov.rustam.homework14;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

/**
 * @author Rustam Khakov
 */
public class Graph {
	Map<String, List<Graph.Edge>> nodes = new TreeMap<>();


	public void print() {
		for (Map.Entry<String, List<Graph.Edge>> entry : nodes.entrySet()) {
			for (Graph.Edge connectedNode : entry.getValue()) {
				System.out.printf("%s ->(%s)->%s%n", connectedNode.from, connectedNode.weight, connectedNode.to);
			}
		}
	}

	/**
	 * вершина графа
	 */
	public class Node {
		private int value;
		private List<Graph.Edge> edges;
	}

	/**
	 * ребро графа
	 */
	public class Edge {
		private String from;
		private String to;
		private int weight;

		public Edge(String from, String to) {
			this.from = from;
			this.to = to;
		}

		public Edge(String from, String to, int weight) {
			this.from = from;
			this.to = to;
			this.weight = weight;
		}
	}


	public void add(String from, String to, int weight) {
		List<Graph.Edge> connectedNodes = nodes.get(from);
		if (connectedNodes == null) {
			connectedNodes = new ArrayList<>();
			nodes.put(from, connectedNodes);
		}
		connectedNodes.add(new Graph.Edge(from, to, weight));
		/*if (to != from) {
			List<Edge> connectedNodes2 = nodes.get(to);
			if (connectedNodes2 == null) {
				connectedNodes2 = new ArrayList<>();
				nodes.put(to, connectedNodes2);
			}
			connectedNodes2.add(new Edge(to, from));
		}*/
	}

	public void printBfs() {
		String firstElem = nodes.keySet().iterator().next();
		Queue<String> elements = new ArrayDeque<>();
		elements.add(firstElem);
		List<String> alreadyProcessed = new ArrayList<>();
		while (!elements.isEmpty()) {
			String currentNodeIndex = elements.poll();
			if (!alreadyProcessed.contains(currentNodeIndex)) {
				System.out.println(currentNodeIndex);
				alreadyProcessed.add(currentNodeIndex);
				List<Graph.Edge> edges = nodes.get(currentNodeIndex);
				if (edges == null) {
					continue;
				}
				for (Graph.Edge edge : edges) {
					elements.add(edge.to);
				}
			}
		}
	}

	public void printDfs() {
		String firstElem = nodes.keySet().iterator().next();
		Stack<String> elements = new Stack<>();
		elements.push(firstElem);
		List<String> alreadyProcessed = new ArrayList<>();
		while (!elements.isEmpty()) {
			String currentNodeIndex = elements.pop();
			if (!alreadyProcessed.contains(currentNodeIndex)) {
				System.out.println(currentNodeIndex);
				alreadyProcessed.add(currentNodeIndex);
				List<Graph.Edge> edges = nodes.get(currentNodeIndex);
				if (edges == null) {
					continue;
				}
				for (Graph.Edge edge : edges) {
					elements.add(edge.to);
				}
			}
		}
	}

	public int howManyWays(String from, String to) {
		Queue<String> elements = new ArrayDeque<>();
		int howManyWays = 0;
		elements.add(from);
		while (!elements.isEmpty()) {
			String currentNodeIndex = elements.poll();
			List<Graph.Edge> edges = nodes.get(currentNodeIndex);
			if (edges == null) {
				continue;
			}
			for (Graph.Edge edge : edges) {
				if (to.equals(edge.to)) {
					howManyWays++;
					continue;
				}
				elements.add(edge.to);

			}
		}
		return howManyWays;
	}
}
