package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {

		String fname = "Mohammad";
		String lname = "Faisal";
		
		char grade = 'A';
		
		String city = "Manassas";
		String state = "Virginia";
		
		String phone = "987-654-3210";
		
		System.out.println("My name is "+ fname+ " and my last name is "+lname);
		System.out.println("I am a "+ grade +" student");
		System.out.println("I live in "+city+ ", " + state);
		System.out.println("My phone number is "+ phone);
		
		city = "New York City"; //reassigning 
		state = "New York"; //reassigning 
		
		phone = "123-456-7890";
		
		System.out.println("My name is "+fname+" " + lname+ " and my new city is "+ city+" and my new state is "+state +". My new phone number is " + phone);
				
		
		
		//Rules for identifiers = names (variables, methods, classes)
		//1. Cannot use keywords as identifiers
		//String new = "Hello"; -> error
		
		
		//2. Cannot have spaces in identifiers
		//String last name = "Smith"; -> error
		
		
		//3. Identifiers cannot start with numbers
		//int 1number=123; -> error
		
		/*4. Identifiers cannot contain any special characters 
		 * except $ or _
		 */
		//boolean hello!= true; -> error
		//boolean hello$ = true; -> no error
		//double $price = 9.98; -> no error
		//float _price1 = 1.99F; -> no error
		
		/*
		 * Naming Conventions
		 * 
		 * Class should start with Uppercase and follow camel casing
		 * 
		 * variables should start with lowercase and follow camel casing
		 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
