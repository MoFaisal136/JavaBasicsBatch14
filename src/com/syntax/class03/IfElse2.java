package com.syntax.class03;

public class IfElse2 {

	public static void main(String[] args) {

		boolean isHungry = true;// if false will not see anything

		if (isHungry) {
			System.out.println("lets eat something yummy");// if false will not see anything
		}
		if (3 > 2)
			System.out.println("There is a true statement inside paranthesis");

		double myBankBalance = 2000;
		double amountTransfer = 2500;

		if (myBankBalance > amountTransfer)
			System.out.println("Funds successfully transferred");
		else
			System.out.println("Try again");

		int money = 100001;

		if (money > 100000) {
			System.out.println("Rich");
			System.out.println("vacations");
			System.out.println("Build own house");
		} else {
			System.out.println("save more");
		}

	}

}
