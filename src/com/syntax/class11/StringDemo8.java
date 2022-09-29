package com.syntax.class11;

public class StringDemo8 {

	public static void main(String[] args) {

		String str="I am always confused";
		
		System.out.println(str.indexOf("a"));
		/*
		 * shows index of where the first index of letter appears
		 */
		System.out.println(str.indexOf("s"));
		System.out.println(str.indexOf(" "));
		
		
		/*
		 * Method gets part of String
		 */
		System.out.println(str.substring(5,10));
		
		
		/*
		 * for finding int first need to move to String
		 */
		int num = 121232323;
		String numStr=String.valueOf(num).substring(1,3);
		System.out.println(numStr);
		num=Integer.parseInt(numStr);
		System.out.println(num);

		
		
	}

}
