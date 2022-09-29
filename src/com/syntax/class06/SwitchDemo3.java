package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Pease tell me where are you from");

		String country = in.nextLine();
		String favFood;
		switch (country) {

		case "USA":
			favFood = "burgers & fries";
			break;

		case "Kazakhstan":
			favFood = "beshparmak";
			break;

		case "Turkey":
			favFood = "adana kebab";
			break;
		case "Venezuela":
			favFood = "Arepa";
			break;
		case "India":
			favFood = "Chicken Curry";
			break;
		case "Yemen":
			favFood = "Mandi";
			break;
		case "Afghanistan":
			favFood = "Qaboli Palow";
			break;
		default:
			favFood = "Unknown";
			break;
		}
System.out.println("You are from "+country+ " and your favorite food is "+favFood );
	}

}
