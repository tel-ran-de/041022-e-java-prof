package de.telrun.khakov.rustam.classwork14;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

/**
 * @author Rustam Khakov
 */
public class Graph {
	Map<Integer, List<Edge>> nodes = new TreeMap<>();


	public void print() {
		for (Map.Entry<Integer, List<Edge>> entry : nodes.entrySet()) {
			for (Edge connectedNode : entry.getValue()) {
				System.out.printf("%s ->(%s)->%s%n", connectedNode.from, connectedNode.weight, connectedNode.to);
			}
		}
	}

	/**
	 * вершина графа
	 */
	public class Node {
		private int value;
		private List<Edge> edges;
	}

	/**
	 * ребро графа
	 */
	public class Edge {
		private int from;
		private int to;
		private int weight;

		public Edge(int from, int to) {
			this.from = from;
			this.to = to;
		}

		public Edge(int from, int to, int weight) {
			this.from = from;
			this.to = to;
			this.weight = weight;
		}
	}


	public void add(int from, int to, int weight) {
		List<Edge> connectedNodes = nodes.get(from);
		if (connectedNodes == null) {
			connectedNodes = new ArrayList<>();
			nodes.put(from, connectedNodes);
		}
		connectedNodes.add(new Edge(from, to, weight));
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
		Integer firstElem = nodes.keySet().iterator().next();
		Queue<Integer> elements = new ArrayDeque<>();
		elements.add(firstElem);
		List<Integer> alreadyProcessed = new ArrayList<>();
		while (!elements.isEmpty()) {
			Integer currentNodeIndex = elements.poll();
			if (!alreadyProcessed.contains(currentNodeIndex)) {
				System.out.println(currentNodeIndex);
				alreadyProcessed.add(currentNodeIndex);
				List<Edge> edges = nodes.get(currentNodeIndex);
				if (edges == null) {
					continue;
				}
				for (Edge edge : edges) {
					elements.add(edge.to);
				}
			}
		}
	}

	public void printDfs() {
		Integer firstElem = nodes.keySet().iterator().next();
		Stack<Integer> elements = new Stack<>();
		elements.push(firstElem);
		List<Integer> alreadyProcessed = new ArrayList<>();
		while (!elements.isEmpty()) {
			Integer currentNodeIndex = elements.pop();
			if (!alreadyProcessed.contains(currentNodeIndex)) {
				System.out.println(currentNodeIndex);
				alreadyProcessed.add(currentNodeIndex);
				List<Edge> edges = nodes.get(currentNodeIndex);
				if (edges == null) {
					continue;
				}
				for (Edge edge : edges) {
					elements.add(edge.to);
				}
			}
		}
	}

	public void findCycles() {
		List<Integer> nodesIndexes = new ArrayList<>(nodes.keySet());
		Collections.sort(nodesIndexes);
		//Integer max = Collections.max(nodesIndexes);
		int[] colors = new int[10];
		// 0 - белый
		// 1 - серый
		// 2 - черный
		for (Integer key : nodes.keySet()) {
			if (colors[key] == 0) {
				findCycle(key, colors);
			}
		}


	}

	public boolean findCycle(int nodeIndex, int[] colors) {
		colors[nodeIndex] = 1;
		boolean isCycle = false;
		List<Edge> edges = nodes.get(nodeIndex);
		if (edges != null) {
			for (Edge edge : edges) {
				if (colors[edge.to] == 0) {
					isCycle = findCycle(edge.to, colors);
				} else if (colors[edge.to] == 1) {
					isCycle = true;
					System.out.println("цикл найден!");
				}
			}
		}
		colors[nodeIndex] = 2;
		if (isCycle) {
			System.out.println(nodeIndex);
		}
		return isCycle;
	}


}
