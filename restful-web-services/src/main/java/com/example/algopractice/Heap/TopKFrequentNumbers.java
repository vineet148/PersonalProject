package com.example.algopractice.Heap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

import org.javatuples.Pair;

public class TopKFrequentNumbers {

	public static void main(String args[]) {
		int arr[] = { 1, 1, 1, 2, 3, 4, 5, 2 };
		int k = 2;

		findTopKfrequentNumbers(arr, k);

	}

	private static void findTopKfrequentNumbers(int[] arr, int k) {
		// TODO Auto-generated method stub

		PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>(
				Collections.reverseOrder()
				);
		Map<Integer, Integer> map = new HashMap<>();

		for (int e : arr) {
			if (!map.containsKey(e)) {

				map.put(e, 1);

			} else {
				int c = map.get(e);
				map.put(e, c + 1);

			}

		}

		for (Entry<Integer, Integer> e : map.entrySet()) {
			int key = e.getKey();
			int val = e.getValue();
			Pair<Integer, Integer> pair = new Pair<Integer, Integer>(val, key);
			pq.add(pair);

		}
		
		int c=0;
		while(!pq.isEmpty() && c< k)
		{
			int k1=(int) pq.remove().getValue(1);
			//int v=(int) pq.remove().getValue(0);
			System.out.println(k1);
			c++;
			
			
		}
		

	}

}
