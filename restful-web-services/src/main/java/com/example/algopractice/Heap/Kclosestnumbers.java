package com.example.algopractice.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

import org.javatuples.Pair;

public class Kclosestnumbers {

	public static void main(String args[]) {
		int arr[] = { 21, 13, 4, 12, 14, 32, 6 };
		int key = 21;
		int k = 3;

		//Wring approach
		// findKClosestNumbers(arr, key, k);

		//Correct
		findKClosestNumbersOtherApproach(arr, key, k);
	}

	private static void findKClosestNumbersOtherApproach(int[] arr, int key, int k) {
		// TODO Auto-generated method stub

		PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>();
		int len = arr.length;
		int absDiff[] = new int[len];

		for (int i = 0; i < len; i++) {
			absDiff[i] = Math.abs(arr[i] - key);
			Pair p = new Pair<>(absDiff[i], arr[i]);
			pq.add(p);

		}

		int c = 0;
		System.out.println("closest numbers");
		while (!pq.isEmpty() && c < k) {
			int k1 = (int) pq.peek().getValue(0);
			int v = (int) pq.peek().getValue(1);

			pq.remove();
			c++;
			System.out.println( v);
		}

	}

	private static void findKClosestNumbers(int[] arr, int key, int k) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> pq;
		int max = findMaxInArr(arr);
		int min = findMinInArr(arr);

		int maxDiff = Math.abs(key - max);
		int minDiff = Math.abs(key - min);

		if (maxDiff <= minDiff) {
			pq = new PriorityQueue<>(Collections.reverseOrder());
		} else {
			pq = new PriorityQueue<>();
		}

		for (int e : arr) {
			pq.add(e);
		}

		int c = 0;

		while (c < k) {
			System.out.println(pq.remove());
			c++;
		}

	}

	private static int findMaxInArr(int[] arr) {
		// TODO Auto-generated method stub

		int max = arr[0];
		for (int elem : arr) {
			if (elem > max) {
				max = elem;
			}
		}
		return max;
	}

	private static int findMinInArr(int[] arr) {
		// TODO Auto-generated method stub
		int min = arr[0];
		for (int elem : arr) {
			if (elem < min) {
				min = elem;
			}
		}

		return min;
	}

}
