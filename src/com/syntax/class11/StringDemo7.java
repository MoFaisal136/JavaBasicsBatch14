package com.syntax.class11;

import java.util.Arrays;

public class StringDemo7 {

	public static void main(String[] args) {

		String str="I love java programming ";
		char[] charArray=str.toCharArray();
		
		/*
		 * toCharArray will convert String to an array of chars
		 */
		
		
		
		System.out.println(Arrays.toString(charArray));
		
		System.out.println(charArray[7]);
		
		int counter=0;
		
		for(char c:charArray) {
			if(c=='a') {
				counter++;
			}
		}
		System.out.println("letter a has appeared "+ counter +" times");
				
		
	}

}
