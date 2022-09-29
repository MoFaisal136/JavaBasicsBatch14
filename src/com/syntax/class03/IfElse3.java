package com.syntax.class03;

public class IfElse3 {

	public static void main(String[] args) {

		int money = 66000;

		if (money >= 65000) {
			System.out.println("I can buy a Tesla");
		} else {
			System.out.println("I need to save more");
		}

		if (money == 65000) {
			System.out.println("I can buy a Tesla");
		} else {
			System.out.println("I need to save more");
		}

		int age = 19;

		if (age != 18) {
			System.out.println("this number is not 18");
		}
		int day = 10;

		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thurday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");

		} else if (day == 7) {
			System.out.println("Sunday");
		}else {
			System.out.println("please enter valid number (1-7)");
		}
	}

}
