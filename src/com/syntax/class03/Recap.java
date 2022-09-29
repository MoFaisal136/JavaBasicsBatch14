package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		
		
		/*
		 * String concatenation helps us combine a String with any Primitive data type
		 * together 
		 * 
		 */
		
		
		String firstName ="Mohammad";
		String lastName = "Faisal";
		String fullName=firstName+" "+lastName;
		System.out.println(fullName);
		System.out.println(firstName+" "+ lastName);
		
		
		int houseNo=10;
		int apartmentNo=5;
		String streetName = "That Street";
		String city="New York";
		String country= "USA";
		String fullAddress=apartmentNo+" "+houseNo+" "+streetName+" "+city+" "+country;
		System.out.println(fullAddress);
		
		String incompleteAddress=houseNo+city;
		
		String step1 = "if we subtract 10 from 5 we get =" +10;//results in a String
		//String step1 = "if we subtract 10 from 5 we get =" -10; WON'T WORK
		/* String step2 = step1-5; it is not defined java doesn't understand what to do
		 * when we ask her to subtract a String from a number it complains
		 * String step2=step1-5;
		 * 
		 */
		System.out.println("if we subtract 10 from 5 we get ="+(10-5));
		System.out.println(step1);
	}

}
