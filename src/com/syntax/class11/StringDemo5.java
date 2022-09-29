package com.syntax.class11;

public class StringDemo5 {

	public static void main(String[] args) {

		String str="Ingrid";
		String str2="Ingrid";
		String str3 = new String("Ingrid");
		
		if (str.equals("Ingrid")) {
			System.out.println("I found it");
			
		}
		/*
		 * equals method checks if 2 Strings are exactly the same
		 * equalsIgnoreCase checks if 2 Strings are exactly the same but do
		 * not care about cases of letters
		 */
		
		if(str.equalsIgnoreCase("ingrid")) {
			System.out.println("I found it with equalsIgnoreCase");
		}
		

		
	}

}
