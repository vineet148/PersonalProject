package com.example.algopractice.Heap;

import java.util.PriorityQueue;

public class KsortedArray {

	public static void main(String args[]) {
		int arr[] = { 3, 4, 1, 2, 5 };
		int k = 2;

		kSortedSort(arr, k);

	}

	private static void kSortedSort(int[] arr, int k) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> heap = new PriorityQueue<>();
		int i = 0, j = 0;

		while (j <= k) {

			heap.add(arr[j]);
			j++;

		}
		j--;
		int len = arr.length;
		while ( j < len && j - i == k) {
			arr[i] = heap.remove();
			i++;
			j++;
			if (j < len) {
				heap.add(arr[j]);
			}
		}
		while (!heap.isEmpty()) {
			arr[i++] = heap.remove();

		}

		for (int e : arr) {
			 System.out.println(e);
		}

	}

}
