package com.leetcode.topinterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = {3,2,2,3};
		int val = 3;
		
		RemoveElement object = new RemoveElement();
		System.out.println("Before ---> " + Arrays.toString(nums)); 
		object.removeElement(nums, val);
		System.out.println("After ---> " + Arrays.toString(nums)); 
	}
	
	public int removeElement(int[] nums, int val) {
		List<Integer> list = new ArrayList<>();
 		for (int i : nums) {
			if ( i!= val) {
				list.add(i);
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
