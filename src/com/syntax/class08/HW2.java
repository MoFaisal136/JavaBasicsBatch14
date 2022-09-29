package com.syntax.class08;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
        double coffeePrice = 2.99;
        double price;
        double remain;
        do {
            System.out.println("Please make a payment for your Coffee:");
            price = input.nextDouble();
            if (price > coffeePrice) {
                remain = price - coffeePrice;
                System.out.println("Please give $" + remain + " less money!");
            } else if (price < coffeePrice) {
                remain = coffeePrice - price;
                System.out.println("Please give $" + remain + " more money!");
            }
        } while (coffeePrice != price);
        System.out.println("Please enjoy your coffee!");
	}

}
