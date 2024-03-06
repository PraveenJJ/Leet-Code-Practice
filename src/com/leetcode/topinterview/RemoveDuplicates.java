package com.leetcode.topinterview;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		RemoveDuplicates object = new RemoveDuplicates();
		object.removeDuplicates(nums);
	}

	public int removeDuplicates(int[] nums) {
		List<Integer> list = new ArrayList<>();
		int x = 0;
		list.add(nums[x]);
		for (int i = 1; i < nums.length; i++) {
			if (list.get(x) != nums[i]) {
				list.add(nums[i]);
				x++;
			}
		}
		int p = 0;
		for (Integer integer : list) {
			nums[p] = integer;
			p++;
		}
		return list.size();
	}

}
