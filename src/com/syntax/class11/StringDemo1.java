package com.syntax.class11;

public class StringDemo1 {

	public static void main(String[] args) {

		
		String str = new String("Java* *");
		String name = "Java";
		/*
		 * counts the number of characters in a string 
		 * including spaces
		 */
		System.out.println(str.length());
		System.out.println(name.length());
		
		if (name.length()>15) {
			System.out.println("Name CANNOT be more than 15 characters");
		}
	
	
	}
	

}
