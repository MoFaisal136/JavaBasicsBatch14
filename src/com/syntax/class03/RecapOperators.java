package com.syntax.class03;

public class RecapOperators {

	public static void main(String[] args) {

		/*
		 * Addition-> +
		 * Subtraction-> -
		 * Multiplication -> *
		 * Division -> /
		 * Remainder (Modulus) -> %
		 */
		
		int num1 = 9;
		int num2 = 2;		
		System.out.println("Answer ="+num1/num2);
		System.out.println("Answer ="+(num1-num2));//need (()) for add/sub
		System.out.println("Remainder ="+num1%num2);
	
		
		double num3 = 9;
		double num4 = 2;	
		System.out.println(num3/num4);
		
		double num5 = 1;
		double num6 = 3;	
		System.out.println(num5/num6);
		
		float num7 = 1;//only floats with decimals need f;
		float num8 = 3;	//but can put if you want doesn't really matter you FOO
		System.out.println(num7/num8);
		

	}

}
