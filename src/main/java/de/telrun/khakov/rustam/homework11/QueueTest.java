package de.telrun.khakov.rustam.homework11;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Rustam Khakov
 */
public class QueueTest {

	public static void main(String[] args) {
		long resSum = 0L;
		int numberOfExperiments = 10;
		for (int i = 0; i < numberOfExperiments; i++) {
			Queue<String> queue = new LinkedList<>();
			long before = System.currentTimeMillis();
			for (int j = 0; j < 1_000_000; j++) {
				queue.add("test");
			}
			long res = System.currentTimeMillis() - before;
			resSum +=res;
		}
		System.out.println(resSum/numberOfExperiments);
		// vip ,!vip , !vip, !vip ,vip , !vip , vip

	}
}
