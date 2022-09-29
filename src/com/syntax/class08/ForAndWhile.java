package com.syntax.class08;

import java.util.Scanner;

public class ForAndWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the number");
		int i = scanner.nextInt();
		
		while(i!=10) {
			System.out.println(i);
			i=scanner.nextInt();
		}
				/*
				 * SAME but while loop will be used because 
				 * we don't know what user will enter
				 */
		
		
	//	for (int k=0; k!=10; k++) {
		//	System.out.println(i);
			//i=scanner.nextInt();
		//}
		
	}

}
