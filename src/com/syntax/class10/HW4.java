package com.syntax.class10;

public class HW4 {

	public static void main(String[] args) {

		/*
		 * From an array of integer elements find the largest number.
		 */

		int[] num = { 100, -5, 10, 20, 30, 40, 50, -4000, 67, 12, 3600 };
		
		int largestnum = num[0];

		for (int i = 1; i < num.length; i++) {
			if (num[i] > largestnum) {
				largestnum = num[i];
			}

		}
		System.out.println(largestnum);

		
		System.out.println("___________________SAME_________________________");
		
		
		//int[] num = { 100, -5, 10, 20, 30, 40, 50, -4000, 67, 12, 3600 };
		
		//int largestnum = num[0];
		
		for(int n:num) {
			
			if(n>largestnum) {
				
				largestnum=n;
			}
			
		}
		System.out.println(largestnum);
		
	}

}
