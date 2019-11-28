package com.ustglobal.arrays;

public class TestA {
public static void main(String[] args) {
	int[] nums = new int[5];
	nums[0] = 10;
	nums[1] = 20;
	nums[2] = 30;
	nums[3] = 40;
	nums[4] = 50;
	for(int i =0;i<5;i++) {
		System.out.println(nums[i]);

	}
	
	System.out.println("______________________________________");
	for(int num : nums) {
		System.out.println(num);
	}
	System.out.println("______________________________________");
	char[] ch =  {'a','b','c','d','e'};
	for(int j = 0;j < ch.length ; j++) {
		System.out.println(ch[j]);
	}
	System.out.println("______________________________________");
	for(int ch1: ch) {
		System.out.println(ch1);
	}
	System.out.println("______________________________________");
	for(char ch1: ch) {
		System.out.println(ch1);
	}
	System.out.println("______________________________________");
	boolean[] b = {true,false,true,true,false,false};
	for(boolean bl : b ) {
		System.out.println(bl);
	}
	
	
}
}
