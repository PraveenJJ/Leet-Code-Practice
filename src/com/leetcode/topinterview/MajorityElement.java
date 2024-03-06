package com.leetcode.topinterview;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		majorityElement(nums);
	}

	private static int majorityElement(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i : nums) {
			Integer integer = map.get(i);
			if (integer == null) {
				map.put(i, 1);
			} else {
				map.put(i, integer + 1);
			}
		}

		Integer key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();

		System.out.println("Map ----> " + map);
		System.out.println("Key ----> " + key);

		return key;
	}

}
