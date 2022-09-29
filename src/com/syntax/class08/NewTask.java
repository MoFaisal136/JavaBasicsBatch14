package com.syntax.class08;

import java.util.Scanner;

public class NewTask {

	public static void main(String[] args) {

		//1. from the range of 1-50 please find the sum of all even and all odd
		/*
		 * 2. create a secret number and let the user guess the secret number
		 * once user guesses number ->program says "You Won!"
		 */
		
		//1. 
		
		for (int i = 1; i<=50; i++) {
			
			if(i%2==0) {
				System.out.println(i+" ");
			}else
				System.out.print(i+" ");
		
		}
		System.out.println("____________________");
		
		
		//**********better way***********
		
		int odd=0;
		int even =0;
		
		for (int i=0; i<=50; i++) {
			if(i%2==0) {
				even+=i;
			}else {
				odd+=i;
			}
		}
		System.out.println("sum of Odd "+ odd);
		System.out.println("sum of Even "+ even);
		
		System.out.println("____________________________");
		
		
		//2.
		Scanner input = new Scanner (System.in);
		int secret = 36;
		int guess;
		
		do {
			System.out.println("Please Enter Your Guess");
			guess=input.nextInt();
		}while(guess !=secret);
		System.out.println("You won!");
		
	}

}
