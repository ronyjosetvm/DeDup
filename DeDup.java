package com.codingexercise;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DeDup {

	public static void main(String[] args) {
		int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1, 18,
				4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6,
				19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };
		// removeDuplicatesWithTree(randomIntegers);
		// removesDuplicateNSqureAlgorithm(randomIntegers);
		/// removeDuplicatesJava8(randomIntegers);

		Integer[] intArr = removeDuplicatesWithTree(randomIntegers);
		System.out.println("randomIntegers" + Arrays.toString(intArr));

	}

	public static Integer[] removeDuplicatesWithTree(int[] arr) {
		Set<Integer> set = new TreeSet<Integer>();
		for (int n : arr)
			set.add(n);
		return set.toArray(new Integer[0]);
	}
	
	public static Integer[] removeDuplicatesInConstantTime(int[] arr) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		for (int n : arr)
			set.add(n);
		return set.toArray(new Integer[0]);
	}

	public static int[] removesDuplicateNSqureAlgorithm(int[] arr) {
		int result[] = new int[arr.length];
		int k = 0;
		boolean status = true;
		for (int i = 0; i < arr.length; i++) {
			status = true;
			for (int j = 0; j < k; j++) {
				if (arr[i] == result[j]) {
					status = false;
					break;
				}
			}
			if (status) {
				result[k] = arr[i];
				k++;
			}
		}
		return result;
	}

	public static int[] removeDuplicatesJava8(int[] arr) {
		return Arrays.stream(arr).distinct().toArray();
	}
}
