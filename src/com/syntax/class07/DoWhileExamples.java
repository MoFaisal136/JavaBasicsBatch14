package com.syntax.class07;

import java.util.Scanner;

public class DoWhileExamples {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);//this line should be repeated for this ex
		String answer;
		
		do {// in this scenario action is being done first so doing do while loop
			System.out.println("Did you get a job");
			answer=sc.next();
		
		}while (!answer.equals("yes"));
		
		System.out.println("Finally");
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
