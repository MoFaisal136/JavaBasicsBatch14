package com.syntax.class12;

public class StringDemoReplace {

	public static void main(String[] args) {

		
		String str="fnwksrnhglrkmr542r22%&^@@65678AAAA5fhgfhgjkf$#";
		
		System.out.println(str.replaceAll("[0-9]","*"));
		System.out.println(str.replaceAll("[0-9]", "*"));
		System.out.println(str.replace("[^A-z]", "*"));
		//"^" means will NOT replace 
	}

}
