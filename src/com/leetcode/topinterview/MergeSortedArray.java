package com.leetcode.topinterview;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		int m = 3;
		int n = 3;

		MergeSortedArray object = new MergeSortedArray();

		object.merge(nums1, m, nums2, n);

	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int p = 0;
		for (int i = m; i < nums1.length; i++) {
			nums1[i] = nums2[p];
			p++;
		}
		Arrays.sort(nums1);

	}

	public void merge1(int[] nums1, int m, int[] nums2, int n) {
		// reducing size for each element
		nums1 = Arrays.copyOf(nums1, m);
		nums2 = Arrays.copyOf(nums2, n);

		// creating destination array
		int[] result = Arrays.copyOf(nums1, m + n);

		// merging array
		System.arraycopy(nums2, 0, result, nums1.length, nums2.length);

		// sorting results
		Arrays.sort(result);

		// assigning results to num1
		nums1 = result;
	}

}
