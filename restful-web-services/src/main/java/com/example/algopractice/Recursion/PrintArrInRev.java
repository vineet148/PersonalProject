package com.example.algopractice.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PrintArrInRev {

	static int max = -1;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		// displayArrReverse(arr, 0);
		// System.out.println(maxOfArray(arr,0));
		// System.out.println(firstIndex(arr,0,2));
		lastIndex(arr, 0, 2);
	}

	public static void displayArrReverse(int[] arr, int idx) {
		if (idx == arr.length) {
			return;
		}

		displayArrReverse(arr, idx + 1);
		System.out.println(arr[idx]);
	}

	public static int maxOfArray(int[] arr, int idx) {
		if (idx == arr.length) {
			return max;
		}

		if (arr[idx] >= max) {
			max = arr[idx];
		}

		return maxOfArray(arr, idx + 1);

	}

	public static int firstIndex(int[] arr, int idx, int x) {
		if (idx == arr.length) {
			return -1;
		}

		if (arr[idx] == x) {
			return idx;
			}

		return firstIndex(arr, idx + 1, x);

	}

	public static int lastIndex(int[] arr, int idx, int x) {
		if (idx == arr.length) {
			return -1;
		}

		int resIdx=lastIndex(arr, idx + 1, x);
		if (arr[idx] == x) {
			System.out.println(idx);
			return;
		}

	}

}
