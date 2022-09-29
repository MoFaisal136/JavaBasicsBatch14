package com.syntax.class09;

public class Array3 {

	public static void main(String[] args) {

		//Shorter way to create array
		
		String[] drink = {"fanta", "milk", "juice", "lemonade", "water", "dr pepper"};
		//						4 elements
		
		
		// Print juice
		
		System.out.println(drink[2]);
		
		
		// print milk
		
		System.out.println(drink[1]);
		
		
		//How many elements inside array?
		
		int size =drink.length;// WILL GIVE BACK NUM OF ELEMENTS
		// assigning to int will print out num of arrays
		
		System.out.println("Size of array = "+size);
	}

}
