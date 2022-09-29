package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard4 {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner (System.in);
		System.out.println("Did you solve Repl Assignments please enter True or False");
		
		boolean solved=scanner.nextBoolean();

		if(solved) {
			System.out.println("How many solved?");
			int numSolved=scanner.nextInt();
			
			if(numSolved>=17) {
				System.out.println("Great Work!");
			}else if(numSolved>10) {
				System.out.println("Finish them up asap");
			}else {
				System.out.println("You will have difficult time");
			}
		}
		else 
		{
			System.out.println("DO THEM");
		}
	}

}
