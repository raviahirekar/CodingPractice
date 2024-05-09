package com.interview.test;

public class InterviewTest4 {

	public static int partition(int[] arr, int left, int right) {

		int pivote = arr[left];
		int l = left;
		int r = l + 1;
		int n = right;
		while (r <= n) {
			if (arr[r] < pivote) {
				l++;
				swap(arr, l, r);

			}
			r++;
		}

		swap(arr, left, l);
		return l;
	}

	public static void quickSort(int[] arr, int left, int right) {

		if (left >= right) {
			return;
		}

		int pivoteIndex = partition(arr, left, right);

		quickSort(arr, left, pivoteIndex - 1);
		quickSort(arr, pivoteIndex + 1, right);

	}

	private static void swap(int[] arr, int l, int r) {
		int tmp = arr[l];
		arr[l] = arr[r];
		arr[r] = tmp;

	}

	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	public static void main(String[] args) {
		int[] input = { 3, 5, 2, 0, 1, 0, 8 };
		quickSort(input);

		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}

	}

}
