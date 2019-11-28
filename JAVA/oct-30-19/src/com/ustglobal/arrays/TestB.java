package com.ustglobal.arrays;

public class TestB {
	public static void main(String[] args) {
		int[] nums = {10,20,30,40};
		receive(nums);
  
		int values[] = {11,12,13,14};
		//int[] values1 = getArray();
		for(int val : values) {
			System.out.println(val);
		}
	}

	

	private static void receive(int[] nums) {
		// TODO Auto-generated method stub
		for (int n1 : nums) {
			System.out.println(n1);
		}
	}

}
