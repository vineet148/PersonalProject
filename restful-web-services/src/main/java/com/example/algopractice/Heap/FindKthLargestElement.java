package com.example.algopractice.Heap;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthLargestElement {

	public static void main(String args[]) {

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
		int ranks[] = { 1, 2, 3, 44, 5 };

		for (int e : ranks) {
			priorityQueue.add(e);

		}

		findKthLargest(priorityQueue, 2);

	}

	private static void findKthLargest(PriorityQueue<Integer> priorityQueue, int k) {
		// TODO Auto-generated method stub

		int i = 0;
		while (i < k ) {
			System.out.println(priorityQueue.peek());
			priorityQueue.remove();
			i++;
		}


	}

}
