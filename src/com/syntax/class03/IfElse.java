package com.syntax.class03;

public class IfElse {

	public static void main(String[] args) {

		double money = 5;
		double KFCsamich = 11;

		if (money > KFCsamich) {
			System.out.println("yayy I can enjoy a burger");
		} else {
			System.out.println("I should make something at home");
		}

		if (true) {
			System.out.println("If block");
		} else {
			System.out.println("else block");
		}

		boolean isHungry = true;
		if (isHungry) {
			System.out.println("yummy");
		} else {
			System.out.println("watch youtube");
		}

	}

}
