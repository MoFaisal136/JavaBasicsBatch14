package com.syntax.class08;

import java.util.Scanner;

public class ContinueTask {

	public static void main(String[] args) {

		/*
		 * Print nums from 1-50 except those divisible by 3
		 */
		
		Scanner input = new Scanner (System.in);
		System.out.println("what you wanna buy");
		String item=input.nextLine();
		
		System.out.println("Price of item");
		double price = input.nextDouble();
		
		double money;
		double total=0;
		double change;
		System.out.println("how much money?");
		
		do {
			
			money=input.nextDouble();
		
			total+=money;//accumulate all money
			double need;
			
			if(total<price) {
				need =price-total;
				System.out.println("Pay more $"+need);	
				
			}else if(total>price) {
				change = total-price;
				System.out.println("Your change is $"+change);
				break;
			}
		}while(total!=price);
		
		System.out.println("thank you come ageen");
		
		
		
	}

}
