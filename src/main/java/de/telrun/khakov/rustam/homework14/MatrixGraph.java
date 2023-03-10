package de.telrun.khakov.rustam.homework14;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

/**
 * @author Rustam Khakov
 */
public class MatrixGraph {
	int[][] edges;

	public MatrixGraph(int[][] edges) {
		this.edges = edges;
	}

	public void printBfs() {
		Queue<Integer> currentNodes = new ArrayDeque<>();
		currentNodes.add(0);
		Set<Integer> alreadyProcessed = new HashSet<>();
		while (!currentNodes.isEmpty()) {
			Integer processingNodeIndex = currentNodes.poll();
			alreadyProcessed.add(processingNodeIndex);
			System.out.println(processingNodeIndex);
			for (int i = 0; i < edges[processingNodeIndex].length; i++) {
				if (edges[processingNodeIndex][i] == 1) {
					if (!alreadyProcessed.contains(i)) {
						currentNodes.add(i);
					}
				}
			}
		}
	}

	public int howManyAdjastementComponents(){
		int howManyComponents = 0;
		int[] colors = new int[edges.length];
		Queue<Integer> currentNodes = new ArrayDeque<>();
		while (getNotProcessedItems(colors) != -1) {
			int processIndex = getNotProcessedItems(colors);
			currentNodes.add(processIndex);
			howManyComponents++;
			while (!currentNodes.isEmpty()) {
				Integer processingNodeIndex = currentNodes.poll();
				colors[processingNodeIndex] = howManyComponents;
				for (int i = 0; i < edges[processingNodeIndex].length; i++) {
					if (edges[processingNodeIndex][i] == 1) {
						if (colors[i] == 0) {
							currentNodes.add(i);
						}
					}
				}
			}
		}
		return howManyComponents;
	}

	private int getNotProcessedItems(int[] colors) {
		for (int i = 0; i < colors.length; i++) {
			if (colors[i] == 0) {
				return i;
			}
		}
		return -1;
	}


}
