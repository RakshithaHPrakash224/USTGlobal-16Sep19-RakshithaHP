package com.ustglobal.collectionframework.list;

public class TestL {
	public static void main (String[] args) 
	{ 

		StudentArray[] arr = new StudentArray[5];


		arr[0] = new StudentArray("aman", 1, "EEE"); 
		arr[1] = new StudentArray("vaibhav", 2, "CS"); 
		arr[2] = new StudentArray("shikar", 3, "IT"); 
		arr[3] = new StudentArray("dharmesh", 4, "Civil"); 
		arr[4] = new StudentArray("mohit", 5, "CS"); 


		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Name of the Student is " + arr[i].name + ", roll_no is: " + 
					i +", and branch is "+ arr[i].branch );
		}

		for(StudentArray object : arr)   {
			System.out.println(object);
		}
	} 

} 
