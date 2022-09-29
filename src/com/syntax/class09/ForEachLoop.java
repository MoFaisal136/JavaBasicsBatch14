package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {

		// When we deal with arrays or collection
		// use for each loop, enhanced for loop. advanced for loop
		
		String[] iceCream = { "Vanilla", "Chocolate", "Mint", "Mango", "cookies n cream" };

		for(String var :iceCream) {

			System.out.println(var);
		}
		
		
		System.out.println("____________________________________________");
		
		
		char[] grade =  {'A', 'B', 'C', 'D', 'F'};

		for(char letter:grade) {
			System.out.println(letter);
		}
		
		System.out.println("___________________________");
		
		int[] nums = {12, 56, 345, 1, 0, 9};
		
		for (int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" "); 
		}
		
		System.out.println();
		//get all values
		
		for(int n: nums) {
			System.out.println(n);
		}
		
		
		
		
		
	}

}
