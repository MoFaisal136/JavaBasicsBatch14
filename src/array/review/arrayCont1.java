package array.review;

import java.util.Arrays;

import java.util.Scanner;

public class arrayCont1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter num of shirts");
		
		int size=scanner.nextInt();
		// will get size from user and will store size variable
		
		double[] prices=new double[size];
		
			for (int i =0; i<size; i++) {	  //+1 so we start with "#1", instead of #0
				System.out.println("please enter price of shirt # "+(i+1));
				prices[i]=scanner.nextDouble();
			
			
			
		}
		System.out.println(Arrays.toString(prices));
		
		
		/*
		 * Limitations of enhanced for loop
		 * we can only go in one direction
		 * we can't skip the elements
		 * we can't use enhanced for loop to update the elements in an array
		 * we can only use it to access the elements 
		 */
		
		double sum=0;
		for(double price:prices) {
			//Obtaining Sum of total
			sum+=price;
		}
		System.out.println("Total for all shirts = "+sum);
	}

}
