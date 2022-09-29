package com.syntax.class10;

public class HW3 {

	public static void main(String[] args) {

		/*
		 * Create an array on integers and calculate the sum of all elements in an array
		 */

		int[] numbers = { 10, 100, 40, 30, 50, 80, 70, 60, 90, 20 };
		int sum = 0;
		System.out.print("Sum Of numbers in this array is: = ");
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];

		}
		System.out.println(sum);// sum = 550
		
		
		System.out.println("__________________SAME__________________");
		
		
		sum = 0; //changed from 550
		
		for (int number:numbers) {
			sum+=number;
		}
		
		System.out.println(sum);
		
	}

}
