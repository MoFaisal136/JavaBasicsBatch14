package com.syntax.class04;

public class InterviewQuestion {

	public static void main(String[] args) {
		/*
		 * Write a Java Program to check whether number is Even or Odd.
		 */

		int num=5;
		System.out.println(5%2);
		/*
		 * if we take the modulus of a num by 2 and answer is 0 it is always an EVEN
		 * number otherwise it is an ODD 
		 */
		if (num%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

}
