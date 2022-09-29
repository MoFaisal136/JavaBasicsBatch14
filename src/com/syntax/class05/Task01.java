package com.syntax.class05;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you have credit card? Answer true or false.");
		boolean result = scanner.nextBoolean();
		if (result) {
			System.out.println("What is the balance on your card?");
			int balance = scanner.nextInt();
			if (balance > 1000) {
				System.out.println("You need to pay immidiately");
			} else {
				System.out.println("You can spend more");
			}
		} else {
			System.out.println("We have a great offer right now!");
		}
	}

}
