package com.syntax.class10;

public class HW5 {

	public static void main(String[] args) {

		/*
		 * Create an array to store char values and then print those in reverse order
		 */

		char[] letters = { 'A', 'D', 'F' };

		//letters.length
		// will give 3
		
		for (int i = letters.length - 1; i >= 0; i--) {
			System.out.print(letters[i] + " ");

		}

	}

}
