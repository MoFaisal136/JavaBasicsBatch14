package com.syntax.class04;

public class NestedIfCondition2 {

	public static void main(String[] args) {

		double moneyInAcc = 2000;
		String season = "Spring";

		if (season.equals("Spring")) {

			if (moneyInAcc > 30000) {
				System.out.println("Vacation");

			} else {
				System.out.println("Save more");
			}
			

		}

	}

}
