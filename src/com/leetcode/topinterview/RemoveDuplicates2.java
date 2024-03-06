package com.leetcode.topinterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicates2 {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		removeDuplicates(nums);
	}

	public static int removeDuplicates(int[] nums) {
		System.out.println("Before ---> " + Arrays.toString(nums)); 
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>(); 

		for (int i : nums) {
			Integer integer = map.get(i);
			if (integer == null) {
				map.put(i, 1);
				list.add(i);
			} else if (integer == 1) {
				map.put(i, 2);
				list.add(i);
			}
		}

		int p = 0;
		for (Integer integer : list) {
			nums[p] = integer;
			p++;
		}
		System.out.println("After ---> " + Arrays.toString(nums)); 
		return list.size();
	}

}
