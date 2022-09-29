package com.syntax.class05;

import java.util.Scanner;

public class NextVsNextLn {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter full name");
		
		//String name = scan.next();
		//System.out.println(name); Only captures until space
		
		String name =scan.nextLine();
		System.out.println(name);
		/*
		 * nextLine allows spaces in whats being entered
		 */
	}

}
