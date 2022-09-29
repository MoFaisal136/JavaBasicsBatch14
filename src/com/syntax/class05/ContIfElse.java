package com.syntax.class05;

public class ContIfElse {

	public static void main(String[] args) {

		boolean allergy = true; // if false JUMPS STRAIGHT TO OUTER ELSE Line 23

		String allergyType = "pollen";

		if (allergy) {
			System.out.println("lets see what allergies you got!");

			if (allergyType.equalsIgnoreCase("Pollen")) {
				/* CASE SENSITIVE but can enter
				 * equalsIgnoreCase
				 */
				System.out.println("Stay inside during spring");

			} else if (allergyType.equals("Peanut")) {
				System.out.println("no reeces");

			} else if (allergyType.equals("Dairy")) {
				System.out.println("no milk");
			} else {
				System.out.println("we need to do some tests");
			}
		} else {
			System.out.println("you good hammy");
		}
	}

}
