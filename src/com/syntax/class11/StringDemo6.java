package com.syntax.class11;

public class StringDemo6 {

	public static void main(String[] args) {

		String str="I love java programming ";
		
		//write a loop to output total number of characters in String
		System.out.print(str.charAt(0));
		System.out.print(str.charAt(1));
		System.out.print(str.charAt(2));
		System.out.print(str.charAt(3));
		System.out.print(str.charAt(4));
		System.out.println(str.charAt(5));
		
		
		/*
		 * charAt returns teh character at a specific index
		 */
		
		for (int i=0; i<str.length();i++) {
			if(!(str.charAt(i)==' ')) {// removes spaces from output
			System.out.println(str.charAt(i));
			}
			
			
		}
	}

}
