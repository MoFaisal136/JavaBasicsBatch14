package com.syntax.class11;

public class StringDemo4 {

	public static void main(String[] args) {

		
		String str=" i love java ";
		//removing extra spacing
		
		System.out.println(str);
		System.out.println(str.trim());
		
		String ing= "Java is Very easy";
		System.out.println(ing.startsWith("Java"));
		System.out.println(ing.endsWith("easy"));
		
		/*
		 * method chaining helps us call multiple methods on a single
		 * line one method after another
		 */
		System.out.println(ing.toLowerCase().contains("very"));
		
		
	}

}
