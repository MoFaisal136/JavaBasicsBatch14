package com.syntax.class05;

import java.util.Scanner;
// ctrl+shift+o

public class ScannerRecap {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name");

		String name = input.next();
		System.out.println("nice to meet u " + name);

		System.out.println("Please enter your age");

		int age = input.nextInt();// capturing integer
		System.out.println(name + " is " + age);

		System.out.println("how much money you got " + name + "?");
		double money = input.nextDouble();

		System.out.println(name + " has $" + money);
		
		System.out.println(name+ " what grade you got");
		
		char grade = input.next().charAt(1);// will capture second Character
		
		System.out.println(name + " has a grade of "+grade);
		
		System.out.println("Please enter another name");
		
		name = input.next();// can change original name entered
		
		System.out.println(" new name is "+ name);
	}

}
